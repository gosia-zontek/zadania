package maj_11;

import java.util.Scanner;

public class Zadanie_10 {
    public static void main(String[] args) {
        //napisz program, ktory pobierze od uzytkownika jedna liczbe dodatnia typu int i obliczy sume cyfr podanej liczby
        //aby rozpatrywac liczbe cyfra po cyfrze, mozesz obliczac reszte z dzielenia liczby przez 10 (aby pozyskac wartosc ostatniej cyfry)
        //i dzielic liczbe bez reszty przez 10 (zeby przesuwac sie do kolejnej liczby)

            // rozwiązanie 1
            String userNumber = getNumber();
            String[] number = getArray(userNumber);
            int suma = countNumbers(number);
            displayResult(suma);

            // rozwiązanie 2
            int userNumber2 = getNumberInt();
            int suma2 = result(userNumber2);
            displayResult(suma2);
        }

        public static String getNumber() {
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            return number;
        }

        public static int getNumberInt() {
            return new Scanner(System.in).nextInt();
        }

        public static int result(int number) {
            int reszta = 0;
            int suma = 0;
            while (number > 0) {
                reszta = number % 10;
                suma += reszta;
                number = number / 10;
            }
            return suma;
        }

        public static String[] getArray(String number) {
            String[] numberSplit = number.split("");
            return numberSplit;
        }

        public static int countNumbers(String[] digits) {
            int suma = 0;
            for (int i = 0; i < digits.length; i++) {
                String s = digits[i];
                int n = Integer.parseInt(s);
                suma += n;
            }
            return suma;
        }

        public static void displayResult(int result) {
            System.out.printf("Suma cyfr wynosi: %d", result);
        }

    }

