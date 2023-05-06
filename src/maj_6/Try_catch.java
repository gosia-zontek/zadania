package maj_6;

import java.util.Scanner;

public class Try_catch {

    public static void main(String[] args) {
        // ArithmeticException
        Integer x = 10 / 0;

        // NullPointerException - trying to invoke a method or get/set a field on a null variable
        String text = null;
        System.out.println(text.charAt(0));

        // ArrayIndexOutOfBoundsException - trying to get/set at an index which is out of array's bounds
        Integer[] numbers = new Integer[10];
        System.out.println(numbers[10]);

        System.out.println("Please write an integer number");
        Scanner scanner = new Scanner(System.in);
        Boolean shouldRepeat = true;

        while (shouldRepeat) {
            try {
                // We TRY to execute this code, but it may throw a NumberFormatException
                String userInput = scanner.nextLine();
                Integer userNumber = Integer.parseInt(userInput);
                System.out.println(userNumber);
                shouldRepeat = false;
            } catch (NumberFormatException e) {
                // This block will execute if the try block throws a NumberFormatException
                System.out.println("THIS IS NOT A NUMBER!!! TRY AGAIN!");
            } catch (Exception e) {
                System.out.println("WHAT JUST HAPPENED?");
            } finally {
                // This block will execute after a successful try or a catch
                System.out.println("FINALLY!");
            }
        }
    }
}