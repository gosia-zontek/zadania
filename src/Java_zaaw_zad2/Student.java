package Java_zaaw_zad2;

public class Student extends Person{
    private String typ;
    private int rok;
    private int koszt;

    public Student(String typ, int rok, int koszt) {
        this.typ = typ;
        this.rok = rok;
        this.koszt = koszt;
    }

    public Student(String name, String address, String typ, int rok, int koszt) {
        super(name, address);
        this.typ = typ;
        this.rok = rok;
        this.koszt = koszt;
    }


    @Override
    public  void showDetails(){
        super.showDetails();
        System.out.println(String.format("typ studiow: %s, rok: %s, koszt studiow: %s ", typ, rok, koszt));

    }
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getKoszt() {
        return koszt;
    }

    public void setKoszt(int koszt) {
        this.koszt = koszt;
    }
}
