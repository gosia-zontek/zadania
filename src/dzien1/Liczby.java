package dzien1;

public class Liczby {
    //    Stwórz tablicę liczb całkowitych i następnie znajdź największy i najmniejszy element tej tablicy.
    public static void main(String[] args) {
        int[] numbers = new int[]{3,5,9, 1, 3, 4, 5, 3};
        int max = numbers[0];
        int min =numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int aktualnyNumer = numbers[i];
            if (aktualnyNumer > max) {
                max =aktualnyNumer;
            }
            if (aktualnyNumer < min) {
                min =aktualnyNumer;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
