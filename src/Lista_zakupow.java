import java.util.HashMap;
import java.util.Map;

public class Lista_zakupow {

    public static void main(String[] args) {

        //najpierw typ klucza, potem typ wartosci
        System.out.println("lista zakupow");
        Map<String, Integer> groceries = new HashMap<>();
        groceries.put("Eggs", 12);
        groceries.put("Milk", 1);
        groceries.put("Water", 1);
        //wartosc moze sie powtarzac, klucz nie
        groceries.put("Cookies", 5);

        //iterate over each map entry
        for (Map.Entry<String, Integer> entry : groceries.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);

        }


        for (Integer value : groceries.values()) {

            System.out.println(value);
        }
    }
}