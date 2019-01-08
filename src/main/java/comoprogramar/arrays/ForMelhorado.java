package comoprogramar.arrays;

// 7.12: ForMelhorado.java
// Utilizando a instrução for aprimorada para somar inteiros em um array.
public class ForMelhorado {

    public static void main(String[] args) {
        int[] numeros = {1, 5, 6, 3, 6};
        int total = 0;

        for(int numero : numeros) {
            total += numero;
        }

        System.out.printf("O valor total eh: %d%n", total);
    }
}
