package maj_6;

public class Library {
//    Zawiera w sobie kolekcję książek i ma następujące metody:
//    getLongestBook() - zwraca książkę o największej ilości stron
//    getBooksByAuthor(String author) - zwraca wszystkie książki napisane przez danego autora
//    getBooksByGenre(String genre) - zwraca wszystkie książki z danego gatunku
//    getBookByTitle(String title) - zwraca pierwszą napotkaną książkę o danym tytule
//    getBooksByPagesAmount(Integer min, Integer max) - zwraca wszystkie książki, których ilość stron mieści się w danym przedziale

    public static void main(String[] args) {
        Book Harry_Potter  = new Book("Harry Potter", "J.K.Rowling", "science-fiction", 234, 5);
        Book Pan_Tadeusz = new Book("Pan Tadeusz", "Adam Mickiewicz", "dramat", 98, 2);
        Book Hamlet = new Book("Hamlet", "Szekspir", "dramat", 13, 4);
        Book Quo_vadis = new Book("Quo_vadis", "Sienkiewicz", "obyczajowa", 590, 6);
    }



}
