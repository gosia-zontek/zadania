package Java_zaaw_zad2;

public class Main {
    public static void main(String[] args) {
        Person studentA = new Student("Gosia", "Krakow 23", "dzienne", 2, 8720);
        studentA.showDetails();
        Person studentB = new Student("Arek", "Tarnow 12", "zaocznie", 5, 1233);
        studentB.showDetails();

        Person lecturerA = new Lecturer("Marcin", "Bielsko 12", "Java", 8743);
        Person lecturerB = new Lecturer("Anna", "Wroclaw 1", "Budownictwo", 3282);
        lecturerB.showDetails();
        lecturerA.showDetails();
    }
}
