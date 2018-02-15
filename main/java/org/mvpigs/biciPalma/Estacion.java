package org.mvpigs.biciPalma;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion{
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    //private Bicicleta[] anclajes = null;
    HashSet<Bicicleta> anclajes = new HashSet();

    public Estacion() {

    }

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
       // this.anclajes = new Bicicleta[numeroAnclajes];

    }

    /* Getters & Setters */
    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    public HashSet<Bicicleta> getAnclajes() {
        return anclajes;
    }

    /* Métodos públicos */

    public void consultarEstacion() {
        System.out.println("id: " + getId());
        System.out.println("direccion: " + getDireccion());
        System.out.println("numeroAnclajes: " + getNumeroAnclajes());
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;
        Iterator anclajeActual = anclajes.iterator();
        while(anclajeActual.hasNext()) { 
            System.out.println(anclajeActual);
            if (anclajeActual == null) {
                anclajesLibres++;
            }
        }

        /*
        for (Bicicleta anclaje : anclajes) {
            if (anclaje == null) {
                anclajesLibres++;
            }
        }*/
        return anclajesLibres;
    }

    public void consultarAnclajes() {
        System.out.println(getAnclajes());
    }

    public void anclarBicicleta(Bicicleta bici) {
        anclajes.add(bici);
        consultarAnclajes();
    }

    public void mostrarAnclaje(Bicicleta bici, int numeroAnclaje) {
        System.out.println("bicicleta: " + bici.toString() + " anclada en el anclaje: " + numeroAnclaje);
    }

    public void mostrarBicicleta(Bicicleta bici, int numeroAnclaje) {
        System.out.println("bicicleta retirada: " + bici.toString() + " del anclaje: " + numeroAnclaje);
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
        return tarjetaUsuario.estaActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
        if (leerTarjetaUsuario(tarjetaUsuario)) {
            Iterator anclajeActual = anclajes.iterator();
            while (anclajeActual.hasNext()) {
                anclajes.remove(anclajeActual.next());
                break;
            }

        } else {
            System.out.println("La tarjeta del usuario no está activa");
        }
    }
    //no necesario para el set
    /*
    public int generarAnclaje() {
        return ThreadLocalRandom.current().nextInt(0, getAnclajes().size());
    }
    */

}