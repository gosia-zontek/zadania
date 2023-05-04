package mastermind;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        //zaimplementuj grę Mastermind, której zasady są następujące:
        // komputer losuje 3 cyfry (od 0 do 9).
        // Użytkownik ma za zadanie je odgadnąć, wpisując je w jednej linii,
        // po spacji, np 1 2 3. Następnie użytkownik dostaje informację
        // zwrotną od komputera w formie trzech wyrazów.
        // HOT oznacza, że użytkownik trafił w cyfrę w odpowiednim miejscu,
        // WARM oznacza, że podana cyfra znajduje się w kombinacji, ale w innym miejscu,
        // a COLD oznacza, że cyfry nie ma w kombinacji.
        // Czyli, jeżeli komputer wymyśli kombinację 1 2 3, a użytkownik podał 1 3 4,
        // to komunikat powinien być HOT WARM COLD. Gra się toczy aż użytkownik
        // odgadnie dokładnie kombinację, czyli dostanie komunikat HOT HOT HOT.
        // Po zaimplementowaniu głównej mechaniki gry, dodatkowym zadaniem
        // jest zaimplementowanie poziomów trudności (łatwy - 3 cyfry do odgadnięcia,
        // średni - 4 cyfry, trudny - 5 cyfer) oraz ilości "żyć" - jeżeli użytkownik
        // nie odgadnie kombinacji np w 5 próbach, przegrywa.

        //1. komputer losuje 3 cyfry
        //2. uzytkownik je odgaduje i wpisuje w linii


        //losowanie trzech liczb i ich wyswietlanie
        Random r = new Random();
     //   int[] numbers = new int[4];
        for (int i = 0; i < 3; i++) {
          //  int zmienna = numbers[3];
          //  int numbers = tablica[3];
            System.out.println(r.nextInt(10));
          //  System.out.println("poka" + zmienna);
        }
    }
    public static void calculator(String result) {
        String message = "";
        Float firstNumber = getNumber("first");
        Float secondNumber = getNumber("second");
        Float thirdNumber = getNumber("third");

       // Float result = numbers(firstNumber, secondNumber, thirdNumber);

        if (result == null) {
            message = "Oops, something went wrong...";
        } else {
            message = "Result:  " + firstNumber + " " + secondNumber+ " "  +thirdNumber + " " +  result;
        }
        System.out.println(message);
       // displayMessage(message);
    }
    public static Float getNumber(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the " + text + " number: ");
        return input.nextFloat();
    }

}
// int losowanieLiczby = r.nextInt(10);
//   System.out.println("losowane liczby to" + losowanieLiczby);}}


