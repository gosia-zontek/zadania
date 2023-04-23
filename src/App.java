public class App {

    public static void main(String[] args){
        //this creates a 3x5 grid, each row has the same size
      //  Integer[][] numbersGrid = new Integer[3][5];

        //Ths creates an array of arrays each row can have a different size
        Integer[][] numbersJaggedArray = new Integer[4][];
        for (Integer i =0; i < numbersJaggedArray.length; i++){
            numbersJaggedArray[i] = new Integer[i+1];

        }
        int[][] numbersGrid = new int[3][5];
        //i to indeks wiersza
        //j to indeks kolumny
        //[i][j] - to komorka
        for (int i =0; i<numbersGrid.length; i++){
            for (int j=0; j<numbersGrid[i].length; j++){
                System.out.print(numbersGrid[i][j]);
            }
            System.out.println();
        }
    }
}
