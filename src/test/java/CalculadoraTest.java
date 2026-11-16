import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void sumaDosMasDos() {
        assertEquals(5, new Calculadora().sumar(2, 2));
    }
}