package comoprogramar.arrays.bidimensionais;

/**
 * GradeNotas
 */
public class GradeNotas {

    private String nomeCurso;
    private int[][] notas;

    public GradeNotas(String nomeCurso, int[][] notas) {
        this.setNomeCurso(nomeCurso);
        this.notas = notas;
    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void processaGrade() {
        mostaGrade();
        mostraGrafico();
    }

    public void mostaGrade() {

        System.out.printf("As notas da grade de estudantes são: %n%n");
        System.out.print("                  ");

        for(int nota = 0; nota < this.notas[0].length; nota++) {
            System.out.printf("Nota%d   ", nota + 1);
        }
        System.out.println(" Media");

        for(int estudante = 0; estudante < this.notas.length; estudante++) {
            System.out.printf("Estudante %2d:  ", estudante + 1);
            for (int nota : this.notas[estudante]) {
                System.out.printf("%8d", nota);
            }
            System.out.printf("%9.2f%n", getMedia(this.notas[estudante]));
        }
        System.out.println();
    }

    public void mostraGrafico() {

        System.out.printf("Graficos da grade de notas dos estudantes %n");

        int[] frequencia = new int[11];

        for (int[] notas : this.notas) {
            for (int nota : notas) {
                ++frequencia[nota / 10];
            }
        }

        for(int contador = 0; contador < frequencia.length; contador++) {

            if (contador == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", contador * 10, (contador * 10) + 9);
            }

            for(int estrela = 0; estrela < frequencia[contador]; estrela++) {
                System.out.printf("%s", "*");
            }

            System.out.println();
        }
    }

    public int getMinino() {

        int menorNota = this.notas[0][0];

        for(int[] notasEstudante : this.notas) {

            for(int nota : notasEstudante) {
                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
        }
        return menorNota;
    }

    public int getMaxima() {
        int maiorNota = this.notas[0][0];

        for (int[] notasEstudante : this.notas) {

            for (int nota : notasEstudante) {
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
            }
        }
        return maiorNota;
    }

    public double getMedia(int[] notasEstudante) {
        int total = 0;

        for (int nota : notasEstudante ) {
            total += nota;
        }
        return (double) total / notasEstudante.length;
    }

}
