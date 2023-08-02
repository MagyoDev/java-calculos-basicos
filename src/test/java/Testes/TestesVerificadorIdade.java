package Testes;
import com.mycompany.atividadeqts.VerificadorIdade;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestesVerificadorIdade {

    @Test
    public void testVerificarIdadeMaiorQue18() {
        VerificadorIdade verificador = new VerificadorIdade();
        assertEquals("Entrada Liberada", verificador.verificarIdade(25));
    }

    @Test
    public void testVerificarIdadeMenorQue18() {
        VerificadorIdade verificador = new VerificadorIdade();
        assertEquals("Entrada Proibida", verificador.verificarIdade(16));
    }

    @Test
    public void testVerificarIdadeMaiorQue60() {
        VerificadorIdade verificador = new VerificadorIdade();
        assertEquals("Entrada não Aconselhada.", verificador.verificarIdade(65));
    }
}
