package ZOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    private List<Zwierze> listaZwierzatZoo = new ArrayList<>();

    public void dodajZwierzatko(Zwierze noweZwierzatko) {
        listaZwierzatZoo.add(noweZwierzatko);
    }

    public void wyswietlListeZwierzat() {
        for (int i = 0; i < listaZwierzatZoo.size(); i++) {
            Zwierze zwierze = listaZwierzatZoo.get(i);
            System.out.println((i + 1) + ". " + zwierze);
        }
    }

    public void zabijanie(Zwierze atakujaceZwierze, Zwierze atakowaneZwierze) {

        int zycie;
        zycie = atakowaneZwierze.getLiczbaZyc() - atakujaceZwierze.getAtak();
        System.out.println(atakowaneZwierze + " ma teraz " + zycie +" życ");
        System.out.println(atakujaceZwierze.getNazwa() + " atakuje " + atakowaneZwierze.getNazwa() +" i teraz " + atakowaneZwierze.getNazwa() + " ma " + zycie + " zyc" );
    }
//    public void atakowanie(Zwierze atakujaceZwierze, Zwierze atakowaneZwierze, int atakujaceZwierzeZycia, int atakowaneZwierzeZycia2){
//        System.out.println(atakujaceZwierze + "atakuje " + atakowaneZwierze + "zniszczenia" + atakowaneZwierze);
//
//      //  atakowaneZwierzeZycia2 -= atakujaceZwierzeZycia;
//        System.out.println(atakowaneZwierzeZycia2);
//    }




}
