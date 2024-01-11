import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testCalculateCosine() {
        // Тест с x = 0, k = 1. Ожидаемый результат: 1
        BigDecimal result1 = Main.calculateCosine(BigDecimal.ZERO, 1);
        assertEquals(BigDecimal.ONE, result1);

        // Тест с x = π/2, k = 3. Ожидаемый результат: 0
        BigDecimal piDividedBy2 = BigDecimal.valueOf(Math.PI / 2);
        BigDecimal result2 = Main.calculateCosine(piDividedBy2, 3);
        assertEquals(BigDecimal.ZERO, result2);

        // Тест с x = π, k = 2. Ожидаемый результат: -1
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        BigDecimal result3 = Main.calculateCosine(pi, 2);
        assertEquals(BigDecimal.valueOf(-1), result3);
    }
}
