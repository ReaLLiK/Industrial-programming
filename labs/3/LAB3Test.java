import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFindTime() {
        // Тест с валидным временем
        String input1 = "Текст 12-34 текст";
        String result1 = Main.findTime(input1);
        assertEquals("12-34", result1);

        // Тест с невалидным временем
        String input2 = "Текст 25-78 текст";
        String result2 = Main.findTime(input2);
        assertNull(result2);

        // Тест без времени
        String input3 = "Текст без времени";
        String result3 = Main.findTime(input3);
        assertNull(result3);
    }

    @Test
    public void testFindShortestSubstring() {
        // Тест с несколькими словами разной длины
        String input1 = "Это тест с несколькими словами";
        String result1 = Main.findShortestSubstring(input1);
        assertEquals("с", result1);

        // Тест с одним словом
        String input2 = "Единственное";
        String result2 = Main.findShortestSubstring(input2);
        assertEquals("Единственное", result2);

        // Тест с пустой строкой
        String input3 = "";
        String result3 = Main.findShortestSubstring(input3);
        assertEquals("", result3);
    }
}
