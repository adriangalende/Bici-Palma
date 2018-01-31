package org.mvpigs.biciPalma;

import java.util.Arrays;
import org.hamcrest.core.IsNull;

public class Estacion{
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes = null;

    public Estacion(){

    }

    public Estacion(int id, String direccion, int numeroAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];
    }


    /* Getters & Setters */
    public int getId(){
        return id;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getNumeroAnclajes(){
        return numeroAnclajes;
    }

    public Bicicleta[] getAnclajes(){
        return anclajes;
    }

    /* Métodos públicos */

    public void consultarEstacion() {
        System.out.println("id: " + getId());
        System.out.println("direccion: " + getDireccion());
        System.out.println("numeroAnclajes: " + getNumeroAnclajes());
    }

    public int anclajesLibres(){
        int anclajesLibres = 0;
        for (Bicicleta anclaje : anclajes){
            if (anclaje == null){
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }

    public void consultarAnclajes(){
        for (int i = 0; i < anclajes.length; i++) {
            if ( anclajes[i] != null ){
                //Obtenemos la id de la bicicleta creada
                System.out.println("Anclaje " + (i+1) + " " + anclajes[i].getId());
            } else {
                System.out.println("Anclaje " + (i+1) + " libre");
            }
        }
    }

    public void anclarBicicleta(Bicicleta bici){
        int i = 0;
        while ( i < anclajes.length ) {
            if( anclajes[i] == null ) {
                anclajes[i] = bici;
                break;
            }
            i++;
        }
        consultarAnclajes();
    }

    public void mostrarAnclaje(Bicicleta bici, int numeroAnclaje){
                System.out.println("bicicleta: " + bici.getId() + " anclada en el anclaje: " + numeroAnclaje);
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.estaActivada();
    }

}