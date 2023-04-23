

import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main( String[] args )  {
        // Array - collection. fixed-size, ordered, index-based
        // List - collection, variable-size, ordered, index-based

        List<Integer> listOfNumbers = new ArrayList<>();
        //w nawiasach ostrych typ zmiennej, a potem nazwa zmiennej
        //List to ogolny typ, jest jakas lista, ArrayList to konkretna implementacja listy
        //Arraylist moze byc zaimplementowany na rozne sposoby
        //Jak tworzymy obiekt, dodajemy jaka konkretnie implementacje listy dodajemy

        //Left-side - List is a generic type of list (an ordered, variable-size collection), we also have to let
        //Java know that its a collection of integers
        //right-side - arraylist is a specific type of list (the most used one), also we dont have to repeat that its
        //a list of integers


        //Adding elements to the list (add always adds an element to the end of the list)
        //sa na koncu dodawane te elementy
        listOfNumbers.add(10);
        listOfNumbers.add(8);
        listOfNumbers.add(-20);
        listOfNumbers.add(15);

        System.out.println("Size: " + listOfNumbers.size());
        for (Integer number: listOfNumbers) {
            System.out.println(number);
        }

        // add an element at the end of the list
        listOfNumbers.add(1);
        //replace an element on given index
        listOfNumbers.set(0, 10);
        //read an element on given index
        Integer x = listOfNumbers.get(2);
        //Check whether given element exits in the list
        //to nam zwroci element, gdzie bedzie 5, jak nie ma 5 to nic nie zwroci
        Boolean exists = listOfNumbers.contains(5);
        // check whether the list has no elements (is empty)
        Boolean isEmpty = listOfNumbers.isEmpty();
        // remove an element on given index
        listOfNumbers.remove(1);
        // Remove an element of given value (only necessary for Integers)
        listOfNumbers.remove((Object)5);
        //wtedy java wie, ze ma usunac element, a nie index (rzutowanie)
        //jesli chce usunac integera z listy integerow
        //indexOf - zwroci nam pierwsze wystapienie czegos w liscie
        //lastindexof - zwroci nam ostatnie wystapienie czegos w liscie



    }
}
