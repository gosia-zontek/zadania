package git;

import java.util.ArrayList;
import java.util.List;

public class Proba {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ala");
        names.add("Ola");
        names.add("Ania");
        names.add("Tomek");
        names.add("Arek");

        System.out.println("imiona: " + names);

        String x = names.get(3);
        System.out.println("imie pod tym indexem to: " + x);

        int index = names.indexOf("Arek");
        System.out.println("pod imieniem Arek jest indeks: " + index);

    }
}
