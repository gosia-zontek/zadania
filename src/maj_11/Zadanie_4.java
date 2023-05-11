package maj_11;

import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        //napisz program,ktory pobierze od uzytkownika dodatnia liczbe typu int i wypisze wszystkie liczby od 1 do podanej liczby, kazda w kolejnej linijce,
        //z takimi zmianami:
        // w miejscu podzielnych przez 3 zamiast liczby powinien program wypisac PIF
        //w miejscu podzielonych przez 7 wypisac PAF
        // w miejscu podzielnej przez 3 i 7 wypisac PIF PAF

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your number: ");
        int number = scanner.nextInt();
// inkrementacja = zwiekszanie wartosci o 1
        //dekrementacja = zmniejszenie wartosci o 1
        for (int i = 0; i <= number; i++) {
            System.out.println(" ");
            //System.out.println(i);

            if (i % 3 == 0) {
                System.out.println("Pif");
            }
            if (i % 7 == 0) {
                System.out.println("Paf");

            }
            if (!(i % 3 == 0) && !(i % 7 == 0)) {
                System.out.println(i);

            }
        }
    }
}
