package Java_zaaw_zad2;

public class Lecturer extends Person {
    private String specjalizacja;
    private int wynagrodzenie;



    public Lecturer(String name, String address, String specjalizacja, int wynagrodzenie) {
        super(name, address);
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }
//    public Lecturer(String specjalizacja, int wynagrodzenie) {
//        this.specjalizacja = specjalizacja;
//        this.wynagrodzenie = wynagrodzenie;
//    }
    @Override
    public  void showDetails(){
        super.showDetails();
        System.out.println(String.format("wykladowca ma specjalizacje: %s, ma wynagrodzenie: %s",specjalizacja, wynagrodzenie));

    }
    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    }
