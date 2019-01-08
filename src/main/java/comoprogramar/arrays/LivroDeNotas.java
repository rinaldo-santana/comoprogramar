package comoprogramar.arrays;

 // Figura 7.14: GradeBook.java
 // classe GradeBook utilizando um array para armazenar notas de teste
public class LivroDeNotas {

    private String nomeCurso;
    private int[] notas;

    public LivroDeNotas(String nomeCurso, int[] notas) {
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getMinima() {
        int notaMenor = this.notas[0];
        for (int nota : this.notas) {
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        return notaMenor;
    }

    public int getMaxima() {
        int notaMaior = this.notas[0];
        for (int nota : this.notas) {
            if (nota > notaMaior) {
                notaMaior = nota;
            }
        }
        return notaMaior;
    }

    public double getMedia() {
        int soma = 0;
        for (int nota : this.notas) {
            soma += nota;
        }
        return (double) soma / this.notas.length;
    }

    public void imprimeNotas() {
        for (int i = 0; i < this.notas.length; i++) {
            System.out.printf("Estudante %2d: %3d%n", i + 1, this.notas[i]);
        }
    }

    public void imprimeGraficoBarra() {
        int[] frequencia = new int[11];

        for (int nota : this.notas) {
            ++frequencia[nota / 10];
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

    public void processaGradeDeNotas() {
        System.out.printf("Curso: %s%n%n", this.nomeCurso);
        System.out.printf("Notas dos estudantes: %n");
        this.imprimeNotas();

        System.out.printf("%nMenor nota da turma: %d%n", this.getMinima());
        System.out.printf("Maior nota da turma: %d%n", this.getMaxima());
        System.out.printf("Media da turma: %3.2f%n", this.getMedia());

        System.out.printf("%nGrafico em barra das notas:%n");
        this.imprimeGraficoBarra();
    }

}
