package mastermind;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mastermind_moje {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        // Tworzenie tablicy n-elementowej
        System.out.println("Tablica zawiera trzy elementy");
        // int w = in.nextInt();
        int[] tab = new int[3];

        // length, oznacza długość tablicy:
        System.out.format("Tablica składa się z %d elementów\n", tab.length);

//        // "Przejście" przez całą tablicę i wypełnienie jej liczbami losowymi
//        for (int i = 0; i < tab.length; i++)
//            tab[i] = r.nextInt(10) + 1;
//        // Wyświetlenie zawartości całej tablicy (każdy element z osobna)
//        for (int i = 0; i < tab.length; i++)
//            System.out.print(tab[i] + " ");
//        System.out.println();

        System.out.println("Wpisz swoje liczby");
        int zliczanie = 0;
        int[] zgadniecia = new int[3];
        ArrayList<String> wynik = new ArrayList<>();

        while (zliczanie <3){
            zliczanie ++;
            int pozycja = 1;
            System.out.println("pozycja" + pozycja);

            for (int i = 0; i < 3; i++) {
                // zgadniecia[i] = in.nextInt(10)+1;
                System.out.println("twoja liczba " + zliczanie);
                zgadniecia[i] = in.nextInt();

            }
            for (int i = 0; i < 4; i++) {
               // if (zgadniecia[i] == tab[i]){
                    wynik.add("HOT");
                    System.out.println(wynik);
                }

            }
    }}



