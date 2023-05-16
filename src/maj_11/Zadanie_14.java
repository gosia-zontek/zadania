package maj_11;

import java.util.Scanner;

public class Zadanie_14 {
    public static void main(String[] args) {
        //napisz program, ktory pobierze od uzytkownika 10 liczb typu int, wypisze dlugosc najdluzszego takiego podciagu liczb, ktory jest rosnacy
        //przykladowo, dla liczb 1,3,8,4,2,5,6,11,13,7 program powinien wypisac 5 jako dlugosc najdluzszego rosnacego podciag
        int[] liczby = new int[10];
        pobierzLiczbyOdUzytkownika(liczby);
        int najdluzszyPodciag = znajdzNajdluzszyRosnacyPodciag(liczby);

        System.out.println("Długość najdłuższego rosnącego podciągu: " + najdluzszyPodciag);
    }

    public static void pobierzLiczbyOdUzytkownika(int[] liczby) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb oddzielonych spacjami:");
        String input = scanner.nextLine();
        String[] liczbyString = input.split(" ");

        try {
            if (liczbyString.length != 10) {
                throw new Exception();
            }

            for (int i = 0; i < 10; i++) {
                liczby[i] = Integer.parseInt(liczbyString[i]);
            }
        } catch (Exception e) {
            System.out.println("Wprowadzono nieprawidłowe dane lub nieprawidłową ilość liczb.");
            System.exit(0);
        }
    }

    public static int znajdzNajdluzszyRosnacyPodciag(int[] liczby) {
        int najdluzszyPodciag = 1;
        int aktualnyPodciag = 1;
        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] > liczby[i - 1]) {
                aktualnyPodciag++;
                if (aktualnyPodciag > najdluzszyPodciag) {
                    najdluzszyPodciag = aktualnyPodciag;
                }
            } else {
                aktualnyPodciag = 1;
            }
        }
        return najdluzszyPodciag;
    }}