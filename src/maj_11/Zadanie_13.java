package maj_11;

import java.util.Scanner;

public class Zadanie_13 {
    public static void main(String[] args) {
        //program ktory sie jaka, pobiera od uzytkownika tekst String
        //wypisuje tekst, gdzie kazde slowo jest wypisywane dwa razy4
        String userText = getUserText();
        doubleString(userText);
    }

    public static String getUserText() {
        System.out.println("Podaj text: ");
        return new Scanner(System.in).nextLine();
    }

    public static void doubleString(String s) {
        String[] words = s.split(" ");
        String[] doubleWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
                doubleWords[i] += words[i] + " " + words[i];

        }
        for (String word : doubleWords) {
            System.out.printf("%s", word);
        }
    }}