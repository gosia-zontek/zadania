package ZOO;

public class Zwierze {
    private String nazwa;
    private int wielkość;
    private int waga;
    private int liczbaZyc;
    private int atak;

    public Zwierze(String nazwa, int wielkość, int waga, int liczbaZyc, int atak) {
        this.nazwa = nazwa;
        this.wielkość = wielkość;
        this.waga = waga;
        this.liczbaZyc = liczbaZyc;
        this.atak = atak;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWielkość() {
        return wielkość;
    }

    public void setWielkość(int wielkość) {
        this.wielkość = wielkość;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;

    }

    public int getAtak() {
        return atak;
    }

    public void setAtak(int atak) {
        this.atak = atak;
    }

    public int getLiczbaZyc() {
        return liczbaZyc;
    }

    public void setLiczbaZyc(int liczbaZyc) {
        this.liczbaZyc = liczbaZyc;

    }

    @Override
    public String toString() {
        return String.format("%s (%d życia)", nazwa, liczbaZyc);
    }


}
