package comoprogramar.arrays;

/**
 * LivroDeNotasTest
 */
public class LivroDeNotasTest {

    public static void main(String[] args) {
        int[] notas = { 100, 55, 87, 98, 70, 75, 90, 92, 67, 82 };
        String curso = "Java- Como programar";

        LivroDeNotas livroNotas = new LivroDeNotas(curso, notas);
        livroNotas.processaGradeDeNotas();
    }
}

// Curso: Java- Como programar
//
// Notas dos estudantes:
// Estudante  1: 100
// Estudante  2:  55
// Estudante  3:  87
// Estudante  4:  98
// Estudante  5:  70
// Estudante  6:  75
// Estudante  7:  90
// Estudante  8:  92
// Estudante  9:  67
// Estudante 10:  82

// Menor nota da turma: 55
// Maior nota da turma: 100
// Media da turma: 81,60
//
// Grafico em barra das notas:
// 00-09:
// 10-19:
// 20-29:
// 30-39:
// 40-49:
// 50-59: **
// 60-69: *
// 70-79: **
// 80-89: ***
// 90-99: ****
//   100: **
