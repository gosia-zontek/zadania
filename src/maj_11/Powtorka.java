package maj_11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Powtorka {
    public static void main(String[] args) {
        //Napisz program, ktory pobierze od uzytkownika tekst (zmienna String)
        //i policzy jakim procentem wszystkich znakow tekstu byl znak spacji
        //czyli liczba spacji/liczba wszystkich znakow *100%


        String longestText = getLongestText(); // wywołujemy metodę pobierającą najdłuższy tekst

        if (longestText.equals("")) { // sprawdzamy czy pobrany tekst jest pusty tzn. czy nie ma tam żadnych znaków ale zmienna istnieje
            System.out.println("Nie podano żadnego tekstu"); // jeśli jest
        } else {
            System.out.println("twoj tekst to: " + longestText); // wypisujemy jeśli nie jest pusty (długość większa od 0 to znaczy)
        }
    }
    public static String getLongestText() { // metoda do szukania najdłuższego Stringu, zwraca go po wywołaniu
        Scanner scanner = new Scanner(System.in);
        String longestText = ""; // najdłuższy znany tekst

        while (true) { // pętla działająca w nieskończoność
            String text = scanner.nextLine(); // pobieramy input od użytkownika

            if (text.equals(" ")) ; // jeśli input to Starczy to stopnujemy pętle
            if (text.length() > longestText.length()) { // jeśli podany tekst jest dłuższy niż najdłuższy aktualnie znany tekst to zapisujemy go
                longestText = text; // teraz to jest najdłuższy
            }
        }

     //   return longestText; // zwracamy po działaniu pętli wynik
    }}