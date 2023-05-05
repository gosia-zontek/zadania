package mastermind;

import java.util.ArrayList;
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

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] wylosowaneLiczby = new int[4];
        for (int i = 0; i < 3; i++) {
            wylosowaneLiczby[i] = random.nextInt(10);
            System.out.println(wylosowaneLiczby[i]);
        }
        int zliczanieProby = 0;

        int[] zgadywanieLiczb = new int[4];

        ArrayList<String> result = new ArrayList<>();
        boolean winner = false;

        System.out.println("Welcome to Mastermind!");

        while (zliczanieProby < 5) {
            zliczanieProby++;
            int position = 1;


            System.out.println(" Proba " + zliczanieProby);

            for (int i = 0; i < 3; i++) {
                System.out.println("Position " + position++ + "");
                zgadywanieLiczb[i] = scanner.nextInt();

            }
            int Hot_count = 0;
            int Warm_count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (zgadywanieLiczb[i] == wylosowaneLiczby[j] && i == j) {
                        Warm_count = Warm_count + 1;
                        result.add(String.valueOf(Warm_count));
                        System.out.println("trafiona cyfra to: " + zgadywanieLiczb[i]);

                    }

                    if (zgadywanieLiczb[i] == wylosowaneLiczby[j] && i != j) {
                        Hot_count = Hot_count + 1;
                        result.add(String.valueOf(Hot_count));
                        System.out.println("w złym miejscu: " + zgadywanieLiczb[i]);
                        break;
                    }
                }
            }
            System.out.print(" Uzyskales tyle punktow :   " + result);
            result.clear();
            if (zliczanieProby == 5) {
                System.out.println(" Proby sie skonczyly");
                break;
            }
            for (int i = 0; i < 4; i++) {
                System.out.print(wylosowaneLiczby[i] + " ");
            }

        }
    }
}