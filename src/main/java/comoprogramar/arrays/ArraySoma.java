package comoprogramar.arrays;

// Livro Como Programa em Java 10 Edicao - Capitulo 7 - Array e ArrayList
// 2 - - pagina xxx - Topico 7.x.x -

public class ArraySoma {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int total = 0;

        for (int item : array) {
            total += item;
        }

        System.out.println("O somatorio do array eh: " + total);
    }
}
