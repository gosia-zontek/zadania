package maj_11;

import java.util.Scanner;

public class Zadanie_12 {
    public static void main(String[] args) {
<<<<<<< HEAD
        String text = getUserText();
        String textWithoutSpaces = getTextWithoutSpaces(text);
        double allCharacters = text.length();
        double withoutSpaces = textWithoutSpaces.length();
        double result = getResult(allCharacters, withoutSpaces);
        System.out.println(text.length());
        System.out.println(textWithoutSpaces.length());
        System.out.printf("Procent spacji w tekście wynosi: %5.2f %%", result);
    }

    public static String getUserText() {
        System.out.println("Please write a text:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getTextWithoutSpaces(String text) {
        String textWithoutSpaces = "";
        textWithoutSpaces = text.replaceAll(" ", "");
        return textWithoutSpaces;
    }

    public static Double getResult(double allCharacters, double withoutSpaces) {
        Double result = 0.0;
        result = ((allCharacters-withoutSpaces)/allCharacters)*100;
        return result;
    }
}
=======
        //Napisz program, ktory pobierze od uzytkownika tekst (zmienna String)
        //i policzy jakim procentem wszystkich znakow tekstu byl znak spacji
        //czyli liczba spacji/liczba wszystkich znakow *100%

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

    }
}
>>>>>>> origin/main
