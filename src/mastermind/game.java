package mastermind;

import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        // Tworzenie tablicy n-elementowej
        System.out.println("Tablica zawiera trzy elementy");
        // int w = in.nextInt();
//        for (int i = 0; i < 3; i++) {
//            System.out.println(r.nextInt(10));

            Set<Integer> numbers = new HashSet<Integer>();
            int ilosc_cyfr = 3;
            while (numbers.size() < ilosc_cyfr) {
                numbers.add((int) (Math.random() * 9 + 1));
            }

            System.out.println("Wylosowane liczby");
            for(Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }



