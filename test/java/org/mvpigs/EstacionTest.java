package org.mvpigs;

import org.mvpigs.biciPalma.Estacion;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class EstacionTest{
    @Test
    public void testComprobarEstacion(){
        Estacion estacion = new Estacion();
        assertEquals(0, estacion.getId());
        assertEquals(null, estacion.getDireccion());
        assertEquals(0, estacion.getNumeroAnclajes());
        assertEquals(null, estacion.getAnclajes());
    }

    @Test
    public void testComprobarEstacionConDatos(){
        Estacion palma = new Estacion(1, "Plaza España", 8);
        System.out.println("[ " + palma.getId() + " ] " + palma.getDireccion() + " " + palma.getNumeroAnclajes());
        assertEquals(8, palma.getAnclajes().length);
    }

    @Test
    public void testConsultarEstacion(){
        Estacion palma = new Estacion(1, "Plaza España", 8);
        palma.consultarEstacion();

    }
}