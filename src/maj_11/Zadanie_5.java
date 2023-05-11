package maj_11;

import java.util.Scanner;

public class Zadanie_5 {
    public static void main(String[] args) {
        //Napisz program, ktory pobierze od uzytkownika liczbe dodatnia typu int i wypisze wszystkie liczby pierwsze
        //wieksze od 1 i mniejsze od podanej liczby

        Scanner scanner = new Scanner(System.in);
        System.out.println("prosze o podanie liczby dodatniej ");
        int number = scanner.nextInt();

        if (number == 2) {
            System.out.println("nie ma, podaj inna");
        }
        if (number > 2) {
            System.out.println("2");
        }
        for (int i = 3; i < number; i++) {
            //  System.out.println(i);
            // if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println("");
                    break;
                } else if (i % j != 0) {
                    System.out.println(i);
                    break;

                }
            }

        }
    }
}

