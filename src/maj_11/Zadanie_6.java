package maj_11;

import java.util.Scanner;

public class Zadanie_6 {
    public static void main(String[] args) {
        //napisz program, ktory pobierze od uzytkownika liczbe n typu int i obliczy sume szeregu harmonicznego od 1 do n, zgodnie ze wzorem

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        int number = scanner.nextInt();

        float czesc;
        float wynik = 0;
        if (number <= 0) System.out.println("to nie jest liczba naturalna");


        for (int i = 1; i <= number; i++) {
            // czesc = 1f/(i);
            czesc = (float) (1.0 / (i));
            System.out.println(String.format("%.2f", czesc));
            wynik += 1 / i;
            System.out.println(wynik);


        }

    }

}


