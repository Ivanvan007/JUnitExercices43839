import org.example.UCs.CU;
import org.example.UCs.Mark;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CU_Test
{
    private static CU cu1;


    @BeforeAll
    public static void setUp()
    {
        cu1 = new CU("Qualidade de Software");

        cu1.insertMark(4000, 12);
        cu1.insertMark(4001, 11.5);
        cu1.insertMark(4002, 17);
        cu1.insertMark(4003, 8.89);
        cu1.insertMark(5000, 9.5);
        cu1.insertMark(5001, 8);
        cu1.insertMark(5002, 7);
        cu1.insertMark(5003, 3.76);

    }


    @ParameterizedTest
    @CsvSource(value = {"4000, 12", "4001, 11.5", "4002,17", "5000, 9.5", "5001, 8"})
    public void testSearchStudentNote(int numeroAluno, double nota)
    {
        double expected = nota;
        double actual = cu1.searchStudentNote(numeroAluno);
        assertEquals(expected,actual);
    }

    @Test
    public void testAverageCU()
    {
        double expected = 9.70625;
        double actual = cu1.averageCU();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"4003", "5001", "5002", "5003"})
    public void testIsAproved(int numeroAluno)
    {
        Boolean expected = false;
        Boolean actual = cu1.isApproved(numeroAluno);
        assertEquals(expected,actual);
    }
}
