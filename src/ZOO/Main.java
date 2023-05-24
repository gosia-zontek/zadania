package ZOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
//
//
//        Zwierze lew = new Zwierze("lew", 2, 100, 3, 1);
//        Zwierze gazela = new Zwierze("gazela", 2, 87, 15, 1);
//        Zwierze tygrys = new Zwierze("tygrys", 1, 99, 10, 1);
//        Zwierze baran = new Zwierze("baran", 1, 76, 13, 1);
//
//        System.out.println("To lista zwierzat w zoo.");
//        Zoo listaZwierzat = new Zoo();
//        listaZwierzat.dodajZwierzatko(lew);
//        listaZwierzat.dodajZwierzatko(gazela);
//        listaZwierzat.dodajZwierzatko(tygrys);
//        listaZwierzat.dodajZwierzatko(baran);
//        listaZwierzat.wyswietlListeZwierzat();
//        listaZwierzat.zabijanie(lew, gazela);
//        listaZwierzat.zabijanie(tygrys, baran);
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> dodajZwierze = new ArrayList<>();
//

//        while (true) {
//            System.out.println("Wpisz, jakie zwierze chcesz dodac do zoo: , " +
//                    "jak napiszesz 'raport' wyswietlisz liste zwierzat");
//            String noweZwierze = scanner.nextLine();
//            if (dodajZwierze.contains(noweZwierze)) {
//                System.out.println("Takie juz zwierze mamy");
//            } else {
//                dodajZwierze.add(noweZwierze);
//            }
//            if (noweZwierze.equals("raport")) {
//                System.out.println(dodajZwierze);
//                break;
//            }
//        }


    public static void main(String[] args) {


        Zwierze lew = new Zwierze("lew", 2, 100, 3, 1);
        Zwierze gazela = new Zwierze("gazela", 2, 87, 15, 1);
        Zwierze tygrys = new Zwierze("tygrys", 1, 99, 10, 1);
        Zwierze baran = new Zwierze("baran", 1, 76, 13, 1);

        System.out.println("To lista zwierzat w zoo.");
        Zoo listaZwierzat = new Zoo();
        listaZwierzat.dodajZwierzatko(lew);
        listaZwierzat.dodajZwierzatko(gazela);
        listaZwierzat.dodajZwierzatko(tygrys);
        listaZwierzat.dodajZwierzatko(baran);
        listaZwierzat.wyswietlListeZwierzat();
        listaZwierzat.zabijanie(lew, gazela);
        listaZwierzat.zabijanie(tygrys, baran);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Zwierze atakujace: ");
        String atakujaceZwierze = scanner.nextLine();
        System.out.println("szanse zwierze atakujace: ");
        double atakujaceZwierzeZycia = 1;
        System.out.println("Zwierze atakowane: ");
        String atakowaneZwierze = scanner.nextLine();

        System.out.println("szanse zwierze atakowane: ");
        double atakowaneZwierzeZycia2 = Integer.valueOf(scanner.nextLine());

        // public static void atakowanie(String atakujaceZwierze, String atakowaneZwierze, double atakujaceZwierzeZycia, double atakowaneZwierzeZycia2)
        {
            System.out.println(atakujaceZwierze + " atakuje " + atakowaneZwierze);

            atakowaneZwierzeZycia2 -= atakujaceZwierzeZycia;
            System.out.println(atakowaneZwierze + " zostalo " + atakowaneZwierzeZycia2 + "życ");
        }

    }

}
