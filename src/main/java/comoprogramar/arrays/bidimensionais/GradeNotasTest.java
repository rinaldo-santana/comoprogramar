package comoprogramar.arrays.bidimensionais;

/**
 * GradeNotasTest
 */
public class GradeNotasTest {

    public static void main(String[] args) {

        String curso = "C0015 - Java Programer";
        int[][] gradeNotas = {{85, 70, 95}, {50, 80, 95}, {89, 75, 99}
            , {96, 89, 92}, {100, 88, 96}, {89, 92, 95}, {55, 89, 79}
            , {79, 52, 88}, {100, 85, 97}, {80, 85, 96}};

        GradeNotas grade = new GradeNotas(curso, gradeNotas);
        grade.processaGrade();
    }
}
