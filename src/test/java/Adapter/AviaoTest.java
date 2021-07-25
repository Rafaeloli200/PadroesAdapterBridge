package Adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AviaoTest {

    @Test
    void deveRetornarEmMetros() {
        Aviao aviao = new Aviao();
        aviao.setAltitude(9000);

        assertEquals(3000, aviao.getAltitude());
    }

}
