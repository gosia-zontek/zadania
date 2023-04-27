import java.util.Set;
import java.util.HashSet;

import java.util. Map;
import java.util.HashMap;
//tworzenie ciagu numerycznego w oparciu o wartosc


public class Mapa {

    public static void main( String[] args){
        //Map - collection, variable-size, unordered, distinct-key-based
        //Map has two collections
        // A set of keys (distinct)
        //And a collection of values
        //each key has one value
        //przypada na jeden klucz jedna wartosc, moga byc dowolnego typu
        //Both key and value can be of any type
        //Recommended key types: Integer, String, Enum

        //najpierw typ klucza, potem typ wartosci
        Map<String, Integer>  groceries = new HashMap<>();
        groceries.put("Eggs", 12);
        groceries.put("Milk", 1);
        groceries.put("Water", 1);
        //wartosc moze sie powtarzac, klucz nie
        groceries.put("Cookies", 11111115);


        //iterate over each map entry
        for (Map.Entry<String, Integer> entry : groceries.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);

        }


        //iterate over keys
        for (String key : groceries.keySet()){
            System.out.println(key);
        }

        for (Integer value:groceries.values()){
            System.out.println(value);
        }

        //Adding a new entry
        groceries.put("bread", 2);
        // remove an entry by key ( po kluczu)
        groceries.remove("Bread");
        //get a value by key
        Integer value = groceries.get("Eggs");
        //sprawdzenie rozmiaru
        groceries.size();
        //
        groceries.isEmpty();
        //
        groceries.containsKey("Chocolate");
        //replace value for given key
        groceries.replace("Eggs", 20);

    }
}
