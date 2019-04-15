package com.company;

import java.util.ArrayList;

public class CadastroFrutas {
    ArrayList<Frutas> frutas ;

    public CadastroFrutas() {
        this.frutas =  new ArrayList<>();
    }

    public void cadastra(String fruta, double precoF){
        Frutas f = new Frutas(fruta, precoF);

        frutas.add(f);
    }

    public String imprimi(){
        String str = "";
        for(int i  = 0; i < frutas.size(); i ++){
            str += frutas.get(i);
            str += "\n----------------------\n";
        }
        return str;
    }

    

}