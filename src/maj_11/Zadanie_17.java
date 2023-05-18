package maj_11;

import java.time.*;
import java.util.Scanner;

public class Zadanie_17 {
    public static void main(String[] args) {
//        LocalDate a = LocalDate.now();
//        LocalTime b = LocalTime.of(12, 14, 51);
//        LocalDateTime c = LocalDateTime.parse("2007-12-03T10:15:30");
//
//        Instant d =  Instant.now(); // zapisanie momentu w czasie w momencie wywolywania polecenia
//        int nano = d.getNano();
//        long sec = d.getEpochSecond();
//
//
//       // LocalTime e = LocalTime.ofInstant(d, ZoneId.systemDefault());
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        int dzienRoku = a.getDayOfYear();
//        System.out.println(dzienRoku);
//        LocalDate plus10dni = a.plusDays(10);
//        LocalTime minus5godzin = b.minusHours(5);
//
//        Duration duration = Duration.between(b, minus5godzin);//roznica w godzinach
//        Period period = Period.between(a, plus10dni); //roznica w datach

        //napisz program, ktory pobierze od uzytkownika date twocih najblizszych zajec w SDA i oblicze ile dni do nich zostalo
        //podpowiedz: date wczytaj jako typ String i przeparsuj na LocalDate
        //obecna date pobierz z metody LocalDate.now();
        LocalDate zajęciaSda = getDate();
        printResult(zajęciaSda);
    }

    public static LocalDate getDate(){

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj datę najbliższych zajęć w SDA w formacie RRRR-MM-DD");
        String date = input.nextLine();
        LocalDate zajęciaSda = LocalDate.parse(date);
        return zajęciaSda;
    }

    public static void printResult(LocalDate zajęciaSda){

        LocalDate dzis = LocalDate.now();
        Period ileDniDoZajec = Period.between(dzis,zajęciaSda);
        ileDniDoZajec.getDays();
        System.out.print("Najbliższe zajęcia SDA odbędą się za : " + ileDniDoZajec.getDays() + " dni");
    }

}