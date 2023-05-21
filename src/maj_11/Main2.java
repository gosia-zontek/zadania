package maj_11;

public class Main2 {
    public static void main(String[] args) {
        String input  = "podana litera:abababababab";

        if (input.matches("podana litera:  .(ab)+")) {
            System.out.println("spelnia sie");
        }
    }
}
