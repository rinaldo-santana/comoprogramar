package comoprogramar.arrays.bidimensionais;
/**
 * ArrayBidimensionaisInit
 */
public class ArrayInit {

    public static void main(String[] args) {

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Os valores do array1 sao: ");
        imprimeArray(array1);

        System.out.printf("\nOs valores do array2 sao: \n");
        imprimeArray(array2);
    }

    public static void imprimeArray(int[][] array) {

        for(int row = 0; row < array.length; row++) {
            for(int col = 0; col < array[row].length; col++ ) {
                System.out.printf("%d  ", array[row][col]);
            }
            System.out.println();
        }
    }
}
