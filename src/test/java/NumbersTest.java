import org.example.Numbers.Numbers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest
{
    @ParameterizedTest
    @CsvSource(value = {"3", "23", "311", "487", "653", "947"})
    public void isPrimeTest(int number)
    {
        boolean expected = true;
        boolean actual = Numbers.isPrime(number);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvSource(value = {"32", "64", "2", "20", "30", "26"})
    public void isEvenTest(int number)
    {
        boolean expected = true;
        boolean actual = Numbers.isEven(number);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"23,23", "46,23", "115,23", "184,23", "207,23", "230,23"})
    public void isMultipleTest(int number, int divisor)
    {
        boolean expected = true;
        boolean actual = Numbers.isMultiple(number, divisor);
        assertEquals(expected,actual);
    }
}
