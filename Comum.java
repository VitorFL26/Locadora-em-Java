package com.mycompany.locadora;

import java.util.Scanner;

public class Comum {
    private String nome;
    private String tipo; //audio ou video
    private String genero;
    private float preco;
    Scanner leitor = new Scanner(System.in);
    
    public Comum(String nome, String tipo, String genero, float preco){
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.tipo = tipo;     
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public float getPreco() {
        return preco;
    }
    
}
