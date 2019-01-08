package comoprogramar.arrays;


/**
 * PesquisaEstudantil
 * Utilizando array para coletar resultado de pesquisa.
 */
public class PesquisaEstudantil {

    public static void main(String[] args) {


        int[] respostas = {1, 4, 3, 5, 5, 5, 3, 3, 3, 4, 2, 1, 1, 1, 3, 3, 4, 2, 1, 5, 10};

        int[] frequencia = new int[6];

        for (int i = 0; i < respostas.length; i++) {
            try {
                ++frequencia[respostas[i]];
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Resultado inexistente na posição [" + i + "] = " + respostas[i]);
            }
        };

        System.out.println("Resultado Frequecia");

        for (int i = 1; i < frequencia.length; i++) {
            System.out.printf("%9d%10d\n", i, frequencia[i]);
        }
    }
}

// CONSOLE
// java.lang.ArrayIndexOutOfBoundsException: 10
// Resultado inexistente na posição [20] = 10
// Resultado Frequecia
//         1         5
//         2         2
//         3         6
//         4         3
//         5         4
