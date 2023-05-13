package maj_11;

import java.util.Scanner;

public class Zadanie_11 {
    public static void main(String[] args) {
        //Napisz program, ktory bedzie od uzytkownika pobieral kolejne teksty (zmienne typu String) tak dlugo,
        //az uzytkownik poda tekst "Starczy", a nastepnie wypisze najdluzszy z podanych tekstów (nie biorac pod uwage tekstu "Starczy");
        //jesli uzytkownik nie poda zadnego tekstu to wypisz "nie podano zadnego tekstu"
        Scanner s = new Scanner(System.in);
        int i=0;
        String rememberText="";
        boolean finish=false;

        while(!finish) {
            String text=s.nextLine();
            //if(text.equals("")) System.out.println("Nie podano żadnego tekstu");
            if (text.equals("Starczy")) {
                finish=true;
            }

            else if (text.length() > i) {
                i = text.length();
                rememberText=text;
            }
        }
        System.out.printf("Najdłuższy tekst to %s, ma on długość %d",rememberText,i);
    }
}
//
//    public static void main(String[] args) {
//        ArrayList<String> userText = getUserText();
//        String longestString = getLongestString(userText);
//        displayResult(longestString);
//    }
//
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static ArrayList<String> getUserText (){
//        String text = scanner.nextLine();
//
//        ArrayList<String> inputText = new ArrayList<>();
//
//        if (text.equals("")) {
//            System.out.println("Nie podano żadnego tekstu");
//        }
//        while (!text.toLowerCase().equals("starczy")) {
//            inputText.add(text);
//            text = scanner.nextLine();
//        }
//        return inputText;
//    }
//
//    public static String getLongestString (ArrayList<String> userText){
//        int max = Integer.MIN_VALUE;
//        String longestText = null;
//
//        for (String item : userText) {
//
//            int textLength = item.length();
//            if (item.length() >= max) {
//                max = textLength;
//                longestText = item;
//            }
//
//        }
//        return longestText;
//    }
//    public static void displayResult (String s){
//        System.out.println(s);
//    }
//}