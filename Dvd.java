package com.mycompany.locadora;

import java.util.ArrayList;

public class Dvd extends Comum{
    public Dvd(String nome, String tipo, String genero, float preco){
        super(nome, tipo, genero,preco);    
    }
    public  ArrayList<String> Lista(){
        ArrayList<String> lista = new ArrayList<String>();       
        lista.add("Atriz: Anne Hathaway, Diretor: Nolan, Tempo: 2:30");
        lista.add("Atriz: Emma Watson, Diretor: Yates, Tempo: 2:00");
        lista.add("Ator: Paul Waker, Diretor: Lin, Tempo: 2:15");
        lista.add("Ator: Goreng, Diretor: Galder, Tempo: 1:30");
        lista.add("Ator: Thomas Shelby, Diretor: Knight, Termpo: 1:00");
        
        return lista;
    }
  }
