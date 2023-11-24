import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    void testThatSumWorksCorrectWithOne() {
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectWithThree() {
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectWithTen() {
        int actual = calc.sum(10);

        //Then
        int expected = 55;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatExceptionThrows() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
