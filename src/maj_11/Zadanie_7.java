package maj_11;

import java.util.Scanner;

public class Zadanie_7 {
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbę naturalną (1 - 42): ");
        int n = new Scanner(System.in).nextInt();

        if (n > 0 && n < 43) {
            System.out.printf("F(%d) = %d %n", n, fib(n));
            System.out.printf("F(%d) = %d %n", n, fibTab(n)[n]);
            printTab(fibTab(n));
        } else System.out.println("Podana liczba jest spoza przedziału!");
    }

    private static int[] fibTab(int n) {
        int[] fTab = new int[n+1];

        fTab[0] = 0;
        fTab[1] = 1;
        for (int i = 2; i <= n; i++) {
            fTab[i] = fTab[i-1] + fTab[i-2];
        }
        return fTab;
    }

    private static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }

    private static void printTab(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}