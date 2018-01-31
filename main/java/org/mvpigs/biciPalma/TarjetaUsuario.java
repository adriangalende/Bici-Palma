package org.mvpigs.biciPalma;

public class TarjetaUsuario {
    private String id;
    private boolean activada = false;

    public TarjetaUsuario() {
        this.id = "000000000";
    }

    public TarjetaUsuario(String id) {
        this.id = id;
    }

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public boolean estaActivada() {
        return this.activada;
    }

    public void setActivada(boolean estado) {
        this.activada = estado;
    }

}