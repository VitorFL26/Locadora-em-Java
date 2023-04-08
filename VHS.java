package com.mycompany.locadora;

import java.util.ArrayList;

public class VHS{
    private String tipo;
    private boolean rodando;
    private String video;
    
    public VHS(String video, boolean rodando){
        this.video = video;
        this.rodando = rodando;
    }

    public String getVideo() {
        return video;
    }

    public boolean isRodando() {
        return rodando;
    }
    
    public void naorebobinando(){
        this.rodando = true;
    }
    public void rebobinando(){
        this.rodando = false;
    }
    public void rodando(){
        if(this.rodando == true){
            System.out.println("A fita não está rebobinando");
        }else 
            System.out.println("A fita está rebobinando");
    }
}
