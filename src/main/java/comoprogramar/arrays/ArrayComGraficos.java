package comoprogramar.arrays;

/**
 * Livro Como Programa em Java 10 Edicao - Capitulo 7 - Array e ArrayList
 * 3 - pagina 198 - 7.4.5 - Utilizando grafico de barra para exibir dados de array graficamente.
 */

public class ArrayComGraficos {
    public static void main(String[] args) {

        int[] ocorrencia = {5, 3, 12, 6, 9};

        String[] cidades = {"Sao Paulo ", "Recife ", "Joao Pessoa ", "Salvador ", "Natal "};

        System.out.printf("%12s%10s%n","Cidade ", "Ocorrencia");

        for (int i = 0; i < cidades.length; i++) {

            System.out.printf("%12s",cidades[i]);

            for (int j = 0; j < ocorrencia[i]; j++) {
                System.out.printf("%s","*");
            }

            System.out.println();
        }
    }
}

//      Cidade Ocorrencia
//   Sao Paulo *****
//      Recife ***
// Joao Pessoa ************
//    Salvador ******
//       Natal *********

