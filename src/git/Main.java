package git;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 5, 9, 12, 323, 49};


        int suma = 0;
        int roznica = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            suma += numbers[i];
        }
        System.out.println("suma liczb: " + suma);

        for (int r = 0; r < numbers.length; r++) {
            roznica -= numbers[r];

        }
        System.out.println("roznica liczb: " + roznica);
    }

}
