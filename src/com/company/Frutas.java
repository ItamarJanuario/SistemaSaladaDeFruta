package com.company;

public class Frutas {


    private String fruta;
    private double precoF;

    public Frutas(String fruta, double precoF) {
        this.fruta = fruta;
        this.precoF = precoF;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public double getPrecoF() {
        return precoF;
    }

    public void setPrecoF(double precoF) {
        this.precoF = precoF;
    }

    public String toString(){
        return "Nome fruta > "+fruta+"\nValor fruta > "+precoF;

    }
}
