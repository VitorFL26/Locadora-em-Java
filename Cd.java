package com.mycompany.locadora;

import java.util.ArrayList;

public class Cd extends Comum{
    public Cd(String nome, String tipo, String genero, Float preco){
        super(nome, tipo, genero, preco);
    }
    public ArrayList<String> Faixas(){      
        ArrayList<String> faixas = new ArrayList<String>();
        faixas.add("Cantor: Michael Jackson, 14 faixas");
        faixas.add("Banda: Queen, 25 faixas");
        faixas.add("Cantor: Amado Batista, 51 faixas");
        faixas.add("Cantor: KayBlack, 9 faixas");
        faixas.add("Cantor: Racionais, 24 faixas");
        return faixas;
    }
}
