package maj9;

import java.util.Scanner;

public class Liczenie_BMI {
    public static void main(String[] args) {
        //napisz program obliczajacy BMI i sprawdzajacy, czy jest ono w normie. program ma wczyxtywac od uzytkownika:
        // wage w kilogramach (float) i wzrost w centymetrach (typ int). BMI powinno byc wyliczone wg wzoru
        //BMI = masa w kg/wzrost w cm
        //optymalny zakres BMI to 18/5-24.9


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj swoja wage ");
        float weight = scanner.nextFloat();

        System.out.println("podaj swoj wzrost ");
        int height = scanner.nextInt();
        //musi byc napisana literka f - bo int nie przechowuje wartosci zmiennoprzecinkowej
        //zmienne maja byc zawsze z malej literki
        float bMI = (weight / ((height / 100f) * (height / 100f)));
        //albo float bmi = weight/(height*height*0.0001f);

        System.out.println("Twoje BMI wynosi " + bMI);

        if (bMI > 18.5f || bMI < 24.9f) {
            System.out.println("Twoje BMI jest optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }
        if (bMI > 18.5f || bMI < 24.9f) System.out.println("Twoje BMI jest optymalne");
        else System.out.println("BMI nieoptymalne");


        String tekst = (bMI <18.5 || bMI>24.9) ? "poza normą" : " w normie";
        System.out.println(tekst);
        System.out.println((bMI <18.5 || bMI>24.9) ? "poza normą" : " w normie");


    }
}

