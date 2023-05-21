package maj_11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Obiektowosc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern.compile("");



        Car auto1 = new Car("BMW", 4);
        Car auto2 = new Car("tesla", 2);

        System.out.println(auto1 != auto2);

        String markaAuta1 = auto1.getMarka();

        auto1.wyswietlInformcje();
        auto2.wyswietlInformcje();

        Car.wyswietl();
    }

}
