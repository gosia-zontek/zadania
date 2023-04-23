package dzien1;

public class Tablice {
    //    Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.
    public static void main(String[] args) {
        //double[] liczby = new double[4];
        double[] liczby = new double[]{19.3, 7.2, 2.0, 4.8};
        //  System.out.println(liczby[0]);
        double suma = 0.0;
        int iloscliczb =liczby.length;
        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);

            suma += liczby[i];


        }
        System.out.println("suma" + suma);
        double srednia = suma/iloscliczb;
        System.out.println(srednia);

    }
}
