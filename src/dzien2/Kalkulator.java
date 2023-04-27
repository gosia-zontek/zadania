package dzien2;

import java.util.Scanner;
import java.util.Set;

public class Kalkulator {

    // Dekompozycja problemu:
// 1. Wyświetlić prośbę o podanie liczby (x2)
// 2. Odczytać liczby od użytkownika
// 3. Wyświetlić prośbę o podanie znaku działania (+, -, *, /)
// 4. Odczytać poprawny znak od użytkownika
// 5. Za pomocą podanego znaku zdekodować jakie działanie ma zostać wykonane
// 6. Wykonać działanie (uwaga: obsłużyć ewentualny błąd dzielenia przez zero)
// 7. Wyświetlić wynik w formie  "A (znak) B = C"  lub komunikat o błędzie
    public static void main( String[] args ) {
        calculator();
    }
    public static void calculator() {
        String message = "";
        Float firstNumber = getNumber("first");
        Float secondNumber = getNumber("second");
        char symbol = getCalculationSymbol();
        Float result = calculate(firstNumber, secondNumber, symbol);
        if (result == null) {
            message = "Oops, something went wrong...";
        } else {
            message = "Result:  " + firstNumber + " " + symbol + " " + secondNumber + " = " + result;
        }
        displayMessage(message);
    }
    public static Float getNumber(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the " + text + " number: ");
        return input.nextFloat();
    }
    public static char getCalculationSymbol() {
        Scanner input = new Scanner(System.in);
        Set<Character> symbolsSet = Set.of('+', '-', '*', '/');
        char symbol = ' ';
        while (!symbolsSet.contains(symbol)) {
            System.out.println("Enter calculation symbol (+, -, *, /): ");
            symbol = input.next().charAt(0);
        }
        return symbol;
    }
    public static Float calculate(Float a, Float b, char symbol) {
        switch (symbol) {
            case '+': return add(a, b);
            case '-': return subtract(a, b);
            case '*': return multiply(a, b);
            case '/': return divide(a, b);
            default: return null;
        }
    }
    public static Float add(Float a, Float b) {
        return a + b;
    }
    public static Float subtract(Float a, Float b) {
        return a - b;
    }
    public static Float multiply(Float a, Float b) {
        return a * b;
    }
    public static Float divide(Float a, Float b) {
        if (b != 0) {
            return a / b;
        }
        return null;
    }
    public static void displayMessage(String message) {
        System.out.println(message);
    }
}
