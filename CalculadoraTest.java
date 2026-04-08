import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }
}