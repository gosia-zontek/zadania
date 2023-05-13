package maj_11;

import java.util.Scanner;

public class Zadanie_9 {
  //  public static void main(String[] args) {
        //napisz program, ktory pobierze od uzytkownika liczbe dodatnia typu int i narysuje fale o zadanej dlugosci i wysokosci
        //4 linijek zgodnie z ponizszym schematem, a puste pola uzupelnij spacjami

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj dlugosc fali ");
//        int n = scanner.nextInt();
//
//        String line1 = "*      *";
//        String line2 = " *    * ";
//        String line3 = "  *  *  ";
//        String line4=  "   **   ";
//
//        System.out.print(line1.repeat(n));
//        System.out.println("");
//        System.out.print(line2.repeat(n));
//        System.out.println("");
//        System.out.print(line3.repeat(n));
//        System.out.println("");
//        System.out.print(line4.repeat(n));
//    }
//}


        public static void main(String[] args)
        {
            System.out.println("Podaj liczbę naturalną: ");
            int n = new Scanner(System.in).nextInt();

            wave();
            waves(n);
            waves2(n);
            waves3(n);
        }

        private static void wave() {
            System.out.println("*      * ");
            System.out.println(" *    *  ");
            System.out.println("  *  *   ");
            System.out.println("   **    ");
        }

        private static void waves(int n) {
            for (int j = 0; j < n; j++) {
                System.out.print("*      * ");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(" *    *  ");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print("  *  *   ");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print("   **    ");
            }
            System.out.println();
        }

        private static void waves2(int n) {
            for (int i = 0; i < 4; i++) {
                String s;
                switch (i) {
                    case 0 :
                        s = "*      * ";
                        break;
                    case 1 :
                        s = " *    *  ";
                        break;
                    case 2 :
                        s = "  *  *   ";
                        break;
                    default :
                        s = "   **    ";
                        break;
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(s);
                }
                System.out.println();
            }
        }

        private static void waves3(int n) {
            String[] item = new String[] {"*      * ", " *    *  ", "  *  *   ", "   **    "};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(item[i]);
                }
                System.out.println();
            }
        }
    }
