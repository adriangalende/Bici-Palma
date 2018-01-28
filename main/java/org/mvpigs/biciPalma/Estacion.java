package org.mvpigs.biciPalma;

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


}