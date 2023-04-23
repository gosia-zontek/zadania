import java.util.ArrayList;
import java.util.List;

public class Zadanie {

    public static void main( String[] args )  {

        List<String> listOfString = new ArrayList<>();
        System.out.println("czesc, wpisz linijke tekstu");
        listOfString.add("Dzien dobry");
        listOfString.add("Dzien dobry x1");
        listOfString.add("Dzien dobry x2");
       // System.out.println("l" + );
        System.out.println("l:" + listOfString.size());
        String x = listOfString.get(2);
        for (String number: listOfString) {
            System.out.println(number);

        }

        // add an element at the end of the list
       // listOfString.add(1);
      //  //replace an element on given index
        //listOfString.set(0, 10);
        //read an element on given index
}}
