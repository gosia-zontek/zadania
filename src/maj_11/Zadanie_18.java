package maj_11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie_18 {

    //napisz program, ktory pobierze od uzytkownika tekst (zmienna typu String) i sprawdzi czy user kichnal, tzn czy w podanym tekscie znajduje sie "aaaa psik"
    //z dowolnie wieloma, ale minimum jedna litera 'a' na poczatku wyrazenia (czyli kichnieciem jest zarowno "a psik" jak i "aaaaaa psik")
    //podpowiedz: uzyj wyrazenia regularnego z odpowiednim kwantyfikatorem
    public static void main( String[] args ) {
        String input = userInput();
        System.out.println(getResult(input));
    }

    public static String userInput() {
        System.out.println("Wpisz dowolny tekst");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getResult(String input) {
        Pattern pattern = Pattern.compile(".*a*psik.*");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String result = "Na zdrowie!";
            return result;
        }
        else {
            String result = "Nikt nie kichnął.";
            return result;
        }
    }
}

