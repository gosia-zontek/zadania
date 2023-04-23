package dzien1;

public class Imiona {
    public static void main(String[] args) {
        //   Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan".
//        Stwórz tablicę imion (bez powtórzeń) i następnie podaj, na którym indexie znajduje się w niej imię "Jan".

        String[] names = new String[]{"Basia", "Olek", "Ania", "Jan", "Pawel", "Jan", "Tomek"};
        int szukanyIndex = 0;
        String szukaneImie = "Jan";
        for (int aktualnyIndex = 0; aktualnyIndex < names.length; aktualnyIndex++) {
            String aktualneImie = names[aktualnyIndex];
            if (aktualneImie.equals(szukaneImie)) {
                szukanyIndex = aktualnyIndex;

                break;
            }
        }
        System.out.println("szukane imie Jan jest na tym miejscu: " + szukanyIndex);
        System.out.printf("szukane imie %s jest na tym miejscu: %s ",szukaneImie,szukanyIndex);
        //  System.out.println("w tablicy znalazlem imie " + szukaneImie+ " " + ilerazy + " razy");
        //  System.out.printf("w tablicy znalazlem imie %s %s razy",szukaneImie,ilerazy);

    }
}
