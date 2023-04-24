package git;


public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 13, 52, 2,4,5,9,12,323,49};

        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        System.out.println("suma liczb= "+ suma);
    }
}
