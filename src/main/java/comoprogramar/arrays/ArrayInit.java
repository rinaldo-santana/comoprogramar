package comoprogramar.arrays;

// Livro Como Programa em Java 10 Edicao - Capitulo 7 - Array e ArrayList
// 1 - pagina xxx - Topico 7.x.x -

public class ArrayInit {
    public static void main(String[] args) {

        // inicializa um array com um objeto array com 10 posicoes
        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Indice", "Valor");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6d%8d%n", i, array[i]);
        }

        // declarando um array com a inicializacao
        String[] frutas = { "banana", "pera", "maca" };

        System.out.printf("%s%9s%n", "Indice", "Valor");

        for (int fruta = 0; fruta < frutas.length; fruta++) {
            System.out.printf("%6d%9s%n", fruta, frutas[fruta]);
        }
    }
}

// Indice Valor
// 0 0
// 1 0
// 2 0
// 3 0
// 4 0
// 5 0
// 6 0
// 7 0
// 8 0
// 9 0
// Indice Valor
// 0 banana
// 1 pera
// 2 maca
