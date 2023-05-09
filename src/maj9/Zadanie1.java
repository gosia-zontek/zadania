package maj9;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1;
        //napisz program, ktory pobierze od uzytkownika srednice okregu (zmienna typu float)
        // i obliczy obwod tego okregu. do obliczen przyjmij najpierw pi = 3.14
        //nastepnie skorzystaj z wbudowanej klasy Math i znajdujacej sie tam stalej PI

        Scanner s = new Scanner(System.in);
        System.out.println("Please give the diameter of the circle: ");
        float diameter = s.nextFloat();
        double pi = 3.14;
        float circumference1 = (float) (diameter * pi);
        float circumference = (float) (2.0 * Math.PI * (diameter/2.0));
        String input = s.nextLine();

        System.out.println("Obwod to " + circumference);
        System.out.println("Obwod to " + circumference1);

    }
}
