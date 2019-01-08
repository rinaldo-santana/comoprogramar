package comoprogramar.arrays;

// 7.13: PassarArray.java
// Passando arrays e elementos do arrays individuais aos métodos.
public class PassarArray {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.printf("Os valores originais do array sao:\n");

        for(int valor : array) {
            System.out.printf(" %d  ", valor);
        }

        modificaArray(array);

        System.out.printf("\nOs valores modificado do array sao:\n");

        for(int valor : array) {
            System.out.printf(" %d  ", valor);
        }

        System.out.printf("\nModificando o valor de array[3]:");
        modificaElemento(array[3]);

        System.out.printf("\nOs valores do array apos o array[3] modificado:\n");

        for(int valor : array) {
            System.out.printf(" %d  ", valor);
        }

    }

    public static void modificaArray(int[] array2) {

        for( int contador = 0; contador < array2.length ; contador++ ) {
            array2[contador] *= 2;
        }
    }

    public static void modificaElemento(int valor) {
        valor *= 3;
        System.out.printf("\nO novo valor do elemento modificado eh: %d", valor);
    }

}
