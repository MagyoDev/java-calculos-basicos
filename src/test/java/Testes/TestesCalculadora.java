package Testes;
import com.mycompany.atividadeqts.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestesCalculadora {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(4, calculadora.subtrair(7, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15, calculadora.multiplicar(3, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, calculadora.dividir(5, 2));
    }

    @Test
    public void testCalcularPorcentagem() {
        assertEquals(20.0, calculadora.calcularPorcentagem(100, 20));
    }
}
