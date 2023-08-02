package Testes;
import com.mycompany.atividadeqts.CalculadoraMedia;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestesCalculadoraMedia {

    private CalculadoraMedia calculadoraMedia;

    @BeforeEach
    public void setUp() {
        calculadoraMedia = new CalculadoraMedia();
    }

    @Test
    public void testCalcularMedia() {
        assertEquals(5.0, calculadoraMedia.calcularMedia(2, 4, 6, 8));
    }

    @Test
    public void testCalcularMediaComValoresNegativos() {
        assertEquals(-3.0, calculadoraMedia.calcularMedia(-5, -1, -3));
    }
}
