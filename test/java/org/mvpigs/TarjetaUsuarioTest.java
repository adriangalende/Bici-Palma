package org.mvpigs;

import org.mvpigs.biciPalma.TarjetaUsuario;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TarjetaUsuarioTest {
    @Test
    public void testTarjetaUsuarioSinActivar() {
        TarjetaUsuario tarjeta = new TarjetaUsuario("123456789");
        assertEquals(false, tarjeta.estaActivada());

    }

    @Test
    public void testTarjetaUsuarioActivada() {
        TarjetaUsuario tarjeta = new TarjetaUsuario("123456789", true);
        assertEquals(true, tarjeta.estaActivada());
    }
}