import java.util.Set;
import java.util.HashSet;


public class ZBIORY {

    public static void main( String[] args){
        //Set - collection, variable-size, unordered, distinct
        //zbior nieuporzadkowany, zbiera tylko unikalne wartosci
        //nie mamy tu indeksów; nie mozemy pojedynczych elementów odczytac
        //praktycznie zawsze odczytuje z pomoca petli FOR


        Set<String> names = new HashSet<>();
        names.add("Mateusz");
        names.add("Karolina");
        names.add("Justyna");
        names.add("Magda");
        //set nie przyjmie dubli,


        for (String name :names) {
            System.out.println(name);
            //nie ma gwarancji, ze zostana oddane w tej samej kolejnosci co my je dalismy
            //nie ma tu czegos takiego jak kolejnosc
            //za kazdym odczytem kolejnosc moze byc inna, ale nie musi
        }

        names.add("Karol");
        names.remove("Mateusz");
        names.size();
        names.isEmpty();

        String[] arrayOfNames = new String[names.size()];
        Integer index = 0;
        for (String name: names){
            arrayOfNames[index] = name;
            index ++;
        }
    }
}
