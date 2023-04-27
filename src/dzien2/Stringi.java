package dzien2;

public class Stringi {
    public static void main(String[] args) {
        //ciag znakow, string to tablica znakow
        //string to typ natywny,
        Character letterA = 'A'; //single character - pojedynczy znak, z nich sklada sie string
        //łaczenie stringow
        String a = "Hello, ";
        String b = " Gosia";
        String c = a + b; //string concatenation by operator
        String d = a.concat(b); // string concatenation by method
        // Strings are immutable! - to znaczy, ze sa niemutowalne
        //typy mutowalne - jak stworzymy jakas wartosc, to moge modyfikowac jego wlasciwosci
        //typy niemutowalne - nie moge modyfikowac ich wlasciwosci
        //nie mozna zmienic wartosci, moge jedynie ja zamienic
        //string cocnatenation jest BARDZO NIEEFEKTYWNA!
        Integer x = 5;
        Integer y = 10;
        Integer z = x * y;
        String operator = "*";
        String messageConcatenated = x + " " + operator + " " + y + " = " + z;

        // String formatting aka string interpolation
        //szablon zawierajacy miejsca do interpolowania wartosci i musimy je wypisac w odpowiedniej kolejnosci po przecinku
        // % d - integer
        // %s - string
        //%f - float, point number

        String messageFormatted = String.format(" %d %s %d = %d", x, operator, y, z);


    }
}
