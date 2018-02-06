package org.mvpigs.biciPalma;

public class Bicicleta{
    private int id;

    public Bicicleta(){
        id = 000;
    }

    public Bicicleta(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String toString() {
        return Integer.toString(this.getId());
    }
    
    
}