
package Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PilotoTest {
    
@Test
    void retornaSalarioPilotoComIFR() {
        Especializacao especializacao = new IFR();
        Piloto piloto = new Piloto(10000);
        piloto.setEspecializacao(especializacao);
        assertEquals(10000.0f, piloto.calcularSalario());
    }
    
    @Test
    void retornaSalarioPilotoComINVA() {
        Especializacao especializacao = new INVA();
        Piloto piloto = new Piloto(10000);
        piloto.setEspecializacao(especializacao);
        assertEquals(14000.0f, piloto.calcularSalario());
    }
    
    @Test
    void retornaSalarioPilotoComMLTE() {
        Especializacao especializacao = new MLTE();
        Piloto piloto = new Piloto(10000);
        piloto.setEspecializacao(especializacao);
        assertEquals(16000.0f, piloto.calcularSalario());
    }
    
}
