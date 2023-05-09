package maj9;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class rownaniaKwadratowe {
    public static void main(String[] args) {
        //Napisz program sluzacy do rozwiazywania rownania kwadratowego. program powinien pobrac trzy liczby calkowite
        //(wspolczynniki rown. kwadr. a b c ) i wyliczyc pierwiastki x1, x2 rownania ax^2 + bx + c = 0;
        //jesli delta wyjdzie ujemna, wypisz delta ujemna i zakoncz program

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a ");
        float a = scanner.nextFloat();
        System.out.println("podaj b ");
        float b = scanner.nextFloat();
        System.out.println("podaj c ");
        float c = scanner.nextFloat();
        float x1;
        float x2;

        float delta = (b*b-4*a*c);
        if (delta > 0 ){
            x1 = (float) (-b-(sqrt(delta))/2*a);
            x2 = (float) ((-b+(sqrt(delta)))/2*a);
            System.out.println("x1 wynosi " + x1);
            System.out.println("x2 wynosi " + x2);

        }
        else System.out.println("delta ujemna");
    }
}
