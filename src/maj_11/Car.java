package maj_11;

public class Car {

    public static void wyswietl(){
        System.out.println("wiadomosc z Car ");
    }

    public static int MAX_POJEMNOSC = 10;

    private String marka;
    private int pojemnosc;


    public Car(String marka, int pojemnosc) {
        this.marka = marka;
        this.pojemnosc = pojemnosc;
    }

    public String getMarka() {
        return this.marka;
    }

    public int getPojemnosc() {
        return this.pojemnosc;
    }

    public void wyswietlInformcje() {
        System.out.println(String.format("marka auta: %s pojemnosc %d ", this.marka, this.pojemnosc));
    }
}
