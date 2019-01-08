package comoprogramar.arrays.bidimensionais;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

/**
 * GradeNotasTest
 */
public class GradeNotasTest {

    @Test
    public void getMediaEstudanteTest() {

        String curso = "C0015 - Java Programer";
        int[][] gradeNotas = {{85, 70, 95}, {50, 80, 95}, {89, 75, 99}
            , {96, 89, 92}, {100, 88, 96}, {89, 92, 95}, {55, 89, 79}
            , {79, 52, 88}, {100, 85, 97}, {80, 85, 96}};

        GradeNotas grade = new GradeNotas(curso, gradeNotas);
        double esperado = 83;
        double calculado = Math.round(grade.getMedia(gradeNotas[0])) ;
        assertTrue("A media por estudante passou. ", esperado == calculado);
    }

}
