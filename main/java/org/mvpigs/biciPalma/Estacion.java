package org.mvpigs.biciPalma;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    //private Bicicleta[] anclajes = null;
    private Map<Integer, Bicicleta> anclajes = new TreeMap<>();
    public Estacion() {

    }

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        setAnclajes(numeroAnclajes);
        //this.anclajes = new Bicicleta[numeroAnclajes];
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

    public Map<Integer, Bicicleta> getAnclajes() {
        return anclajes;
    }

    public void setAnclajes(int numeroAnclajes) {
        for(int i = 0 ; i < numeroAnclajes ; i++) {
            anclajes.put(i, null);

        }
    }

    /* Métodos públicos */

    public void consultarEstacion() {
        System.out.println("id: " + getId());
        System.out.println("direccion: " + getDireccion());
        System.out.println("numeroAnclajes: " + getNumeroAnclajes());
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Map.Entry<Integer, Bicicleta> anclaje : getAnclajes().entrySet()) {
            if (anclaje.getValue() == null) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }

    public void consultarAnclajes() {
        for (int i = 0; i < getAnclajes().size(); i++) {
            if ( anclajes.get(i) != null) {
                //Obtenemos la id de la bicicleta creada
                System.out.println("Anclaje " + (i + 1) + " " + anclajes.get(i).toString());
            } else {
                System.out.println("Anclaje " + (i + 1) + " libre");
            }
        }
    }

    public void anclarBicicleta(Bicicleta bici) {
        int i = 0;
        while (i < getAnclajes().size()) {
            if (anclajes.get(i) == null) {
                anclajes.put(i, bici);
                break;
            }
            i++;
        }
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

            int posicion = generarAnclaje();
            boolean biciRetirada = false;

            while (!biciRetirada) {
                if (anclajes.get(posicion) != null) {
                    mostrarBicicleta(anclajes.get(posicion), (posicion + 1));
                    anclajes.put(posicion, null);
                    biciRetirada = true;
                }
            }

        } else {
            System.out.println("La tarjeta del usuario no está activa");
        }
    }

    public int generarAnclaje() {
        return ThreadLocalRandom.current().nextInt(0, getAnclajes().size());
    }
}