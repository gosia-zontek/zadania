package mastermind;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


// todo: InputMismatchException
public class  mastermind_2 {

    public static void main(String[] args) {

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
            for (int i = 0; i < 3; i++) {
                if (zgadywanieLiczb[i] == wylosowaneLiczby[i]) {
                    result.add("HOT");
                }

            }
            if (zgadywanieLiczb[0] == wylosowaneLiczby[1] || zgadywanieLiczb[0] == wylosowaneLiczby[2] || zgadywanieLiczb[0] == wylosowaneLiczby[3]) {
                result.add("WARM");
            }

            if (zgadywanieLiczb[1] == wylosowaneLiczby[2] || zgadywanieLiczb[1] == wylosowaneLiczby[3] || zgadywanieLiczb[1] == wylosowaneLiczby[0]) {
                result.add("WARM");
            }

            if (zgadywanieLiczb[2] == wylosowaneLiczby[0] || zgadywanieLiczb[2] == wylosowaneLiczby[1] || zgadywanieLiczb[2] == wylosowaneLiczby[3]) {
                result.add("WARM");
            }

            if (zgadywanieLiczb[3] == wylosowaneLiczby[0] || zgadywanieLiczb[3] == wylosowaneLiczby[1] || zgadywanieLiczb[3] == wylosowaneLiczby[2]) {
                result.add("WARM");
            }

            if (zgadywanieLiczb[0] == wylosowaneLiczby[0] && zgadywanieLiczb[1] == wylosowaneLiczby[1] && zgadywanieLiczb[2] == wylosowaneLiczby[2] && zgadywanieLiczb[3] == wylosowaneLiczby[3]) {
                result.add("HOT");
                winner = true;

                break;
            }

            System.out.print(" Uzyskales tyle punktow:   " + result);

            result.clear();

            if (zliczanieProby == 5) {
                System.out.println("  Nie zgadles kodu.");
                System.out.println(" Kod: ");
                break;
            }

        }

        if (winner) {
            System.out.println("Congrats, you won!");
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(wylosowaneLiczby[i] + " ");
        }


    }
}