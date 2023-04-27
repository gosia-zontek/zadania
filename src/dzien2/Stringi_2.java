package dzien2;

public class Stringi_2 {
    public static void main(String[] args) {
        //operacje na stringach
        //equals
        //split
        //upper/lowercase
        //charAt
        //Iterate
        // replace
//
//        //for primitive types (integer, double, character, boolean)
//        // == and equals sa takie same - zwracaja prawde, jesli sa sobie rowne
//        //dla typow zlozonych ( String, Arrays, Maps, Sets, Lists) zachowuja sie inaczej
//        // == zwracaja prawde, jesli obie wartosci sa takie same
//        // equals() zwracaja prawde, jesli obie wartosci sa rowne
//
//        String a = "hello";
//        String b = "hello";
//        //zwroci nam true jesli obie linijki maja ta sama zawartosc
//        Boolean areTheseEqual = a.equals(b);
//
//        //zwraca prawde jesli to jest ten sam string
//        Boolean areTheseSame = a == b;

//************ 2 zagadnienie

//
//        String text = "Hello, world";
//        String upperCase = text.toUpperCase();
//        String lowerCase = text.toLowerCase();
//
//        System.out.println(text);
//        System.out.println(upperCase);
//        System.out.println(lowerCase);
//
//        //use case for string searching;
//        String searchedItem = "Golf Club";
//        String userQuery = "golf club";
//
//        //returns false, because G anc C letters are different
//        Boolean caseInsensitiveCompareWithLowerCase = searchedItem
//                .toLowerCase().equals(userQuery.toLowerCase());
//        Boolean caseInsensitiveCompareWithUpperCase = searchedItem
//                .toUpperCase().equals(userQuery.toUpperCase());
//        Boolean caseInsensitiveCompare = searchedItem.equalsIgnoreCase(userQuery);


        //*********** replace
        //podmienianie stringa
//        String name = "Anna Agnieszka Alina";
//        String modifiedName = name.replace("n", "b");
//        System.out.println(modifiedName);
//
//
//        String tooManySpaces = "X              y    z     a    b   g";
//        String withoutSpaces = tooManySpaces.replace(" ", "");
//        System.out.println(withoutSpaces);
//

        //trim - jesli mamy wiele spacji na poczatku i koncu mozemy e usunac
//        String spacesAtEnds = "            ala ma kotk             ";
//        String withoutSpacesAtEnds = spacesAtEnds.trim();
//        System.out.println(withoutSpacesAtEnds);

        //******odczytanie pojedynczego znaku ze stringa
//
//        String text = "Hello, world";
//        Character c = text.charAt(5);
//        System.out.println(c);
//
//        //iterowanie, wypisze mi znak po znaku
//
//        for (int i = 0; i < text.length(); i++) {
//            Character character = text.charAt(i);
//            System.out.println(character);
//        }
//
//        //toCharArray konwertuje nam text na tablice znakow
//        for (Character character:text.toCharArray()){
//            System.out.println(character);
//        }


        //*********SPLIT
        //split - dzielenie stringa na kilka podstringow

        String text = "Ala ma kota rudego";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        String numbersText = "10 50 100";
        String[] numbersSplit = numbersText.trim().split(" ");
        //parsowanie - dzielenie na kawalki
        //line of text = array of strings -> array of integers
        //wszystko musi sie dac zmienic na integera, nie moga byc ulamki
        Integer[] numbers = new Integer[numbersSplit.length];


        //40+50=90
        // [0], [1], [2]
        for (Integer i = 0; i < numbersSplit.length; i++) {
            String s = numbersSplit[i];
            Integer number = Integer.parseInt(s);
            numbers[i] = number;
        }
    }
}
