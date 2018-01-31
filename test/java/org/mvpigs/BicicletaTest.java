package org.mvpigs;

import org.mvpigs.biciPalma.Bicicleta;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BicicletaTest {
    @Test
    public void testBicicleta() {
        Bicicleta bici = new Bicicleta(111);
        assertEquals(111, bici.getId());
    }

}