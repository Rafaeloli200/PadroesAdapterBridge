
package Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComissarioDeBordoTest {
    
@Test
    void retornaSalarioComissarioDeBordoComIFR() {
        Especializacao especializacao = new IFR();
        ComissarioDeBordo comissarioDeBordo = new ComissarioDeBordo(10000);
        comissarioDeBordo.setEspecializacao(especializacao);
        assertEquals(12000.0f, comissarioDeBordo.calcularSalario());
    }
    
    @Test
    void retornaSalarioComissarioDeBordoComINVA() {
        Especializacao especializacao = new INVA();
        ComissarioDeBordo comissarioDeBordo = new ComissarioDeBordo(10000);
        comissarioDeBordo.setEspecializacao(especializacao);
        assertEquals(12000.0f, comissarioDeBordo.calcularSalario());
    }
    
    @Test
    void retornaSalarioComissarioDeBordoComMLTE() {
        Especializacao especializacao = new MLTE();
        ComissarioDeBordo comissarioDeBordo = new ComissarioDeBordo(10000);
        comissarioDeBordo.setEspecializacao(especializacao);
        assertEquals(12000.0f, comissarioDeBordo.calcularSalario());
    }
    
}
