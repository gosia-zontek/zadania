package maj_6;

public class Book {

//    Zaimplementuj klasę Book, która reprezentuje książkę i zawiera takie informacje,
//    jak tytuł, autor, ilość stron, gatunek oraz ocena w skali 1-5,
//    a także referencja do kontynuacji (jeżeli istnieje,
//    np Harry Potter i Kamień Filozoficzny ma kontynuację, jaką jest Harry Potter i Komnata Tajemnic).
//    Następnie zaimplementuj klasę Library, która reprezentuje bibliotekę. Zawiera w sobie kolekcję książek i ma następujące metody:
//    getLongestBook() - zwraca książkę o największej ilości stron
//    getBooksByAuthor(String author) - zwraca wszystkie książki napisane przez danego autora
//    getBooksByGenre(String genre) - zwraca wszystkie książki z danego gatunku
//    getBookByTitle(String title) - zwraca pierwszą napotkaną książkę o danym tytule
//    getBooksByPagesAmount(Integer min, Integer max) - zwraca wszystkie książki, których ilość stron mieści się w danym przedziale

    private String tytul;
    private String autor;
    private Integer ilosc_stron;
    private String gatunek;
    private Integer ocena;

    public Book(String tytul, String autor, String gatunek, Integer ilosc_stron, Integer ocena){
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
        this.ilosc_stron = ilosc_stron;
        this.ocena = ocena;
    }




    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getIlosc_stron() {
        return ilosc_stron;
    }

    public void setIlosc_stron(Integer ilosc_stron) {
        this.ilosc_stron = ilosc_stron;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Integer getOcena() {
        return ocena;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }
}
