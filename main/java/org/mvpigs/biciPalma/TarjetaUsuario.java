package org.mvpigs.biciPalma;

public class TarjetaUsuario{
    private int id;
    private boolean activada = false;

    public TarjetaUsuario(){
        id = 000000000;
    }

    public TarjetaUsuario(int id){
        this.id = id;
    }

    public TarjetaUsuario(int id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public boolean estaActivada(){
        return activada;
    }

}