package com.mycompany.locadora;

import java.util.Scanner;


public class Locadora {

    public static void main(String[] args) {
        Dvd[] dvd = new Dvd[5];
        Cd[] cd = new Cd[5];
        VHS[] vhs = new VHS[5];
        
        dvd[0] = new Dvd("Interestelar", "Video", "Drama", 12.50f);
        dvd[1] = new Dvd("Harry Potter", "Video", "Fantasia", 15.50f);
        dvd[2] = new Dvd("Velozes e Furiosos", "Video", "Ação", 11.50f);
        dvd[3] = new Dvd("O Poço", "Video", "Terror", 20.00f);
        dvd[4] = new Dvd("Peak Blinders", "Video", "Crime", 18.50f);
        
        cd[0] = new Cd("Thriller", "Música", "Pop", 10.0f);
        cd[1] = new Cd("Bohemian Rhapsody", "Música", "Rcok", 11.0f);
        cd[2] = new Cd("Amado Batista", "Música", "Brega Nacional", 5.0f);
        cd[3] = new Cd("Contradições", "Música", "Funk", 12.0f);
        cd[4] = new Cd("Raio-X Brasil", "Música", "Rap", 7.0f);
        
        vhs[0] = new VHS("Vídeo: Me at the zoo",true);
        vhs[1] = new VHS("Vídeo: Gangnam Style", false);
        vhs[2] = new VHS("Vídeo: Barbixas", true);
        vhs[3] = new VHS("Vídeo: Eu, a Patroa e as Crianças", false);
        vhs[4] = new VHS("Video: TOP 5 carros mais rápidos",true);
        
        int op = 0;
        
        while(op != 4){
        Scanner leitor = new Scanner(System.in);
           
        System.out.println("Escolha uma opção: ");
            System.out.println("1. Quero ver um filme.");
            System.out.println("2. Quero ouvir uma música.");
            System.out.println("3. Sou raiz e quero ver um VHS.");
            System.out.println("4. Sair");
            op = leitor.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Filme 1: " +dvd[0].getNome() + " | Gênero: " + dvd[0].getGenero() + " | Preço: " + dvd[0].getPreco());
                    System.out.println("Filme 2: " +dvd[1].getNome() + " | Gênero: " + dvd[1].getGenero() + " | Preço: " + dvd[1].getPreco());
                    System.out.println("Filme 3: " +dvd[2].getNome() + " | Gênero: " + dvd[2].getGenero() + " | Preço: " + dvd[2].getPreco());
                    System.out.println("Filme 4: " +dvd[3].getNome() + " | Gênero: " + dvd[3].getGenero() + " | Preço: " + dvd[3].getPreco());
                    System.out.println("Filme 5: " +dvd[4].getNome() + " | Gênero: " + dvd[4].getGenero() + " | Preço: " + dvd[4].getPreco());  
                       System.out.println("Gostou de algum filme? 1 = Sim | 2 = Não");
                        int resp = leitor.nextInt();
                        if(resp == 1){
                            System.out.println("Digite o número do filme que gostou para saber mais sobre ele, como: Ator/Atriz, Diretor, Duração ");
                            int esc = leitor.nextInt();
                                System.out.println(dvd[esc-1].Lista().get(esc-1));
                                System.out.println("Deseja escolher esse filme? 1 = Sim | 2 = Não");   
                                    int dec = leitor.nextInt();
                                        if(dec == 1){
                                            System.out.println("FILME LOCADO!");
                                        }else break;
                        }else break;
                break;
                case 2:
                    System.out.println("Albúm 1: " +cd[0].getNome() + " | Gênero: " +cd[0].getGenero() + " | Preço: " + cd[0].getPreco());
                    System.out.println("Albúm 2: " +cd[1].getNome() + " | Gênero: " +cd[1].getGenero() + " | Preço: " + cd[1].getPreco());
                    System.out.println("Albúm 3: " +cd[2].getNome() + " | Gênero: " +cd[2].getGenero() + " | Preço: " + cd[2].getPreco());
                    System.out.println("Albúm 4: " +cd[3].getNome() + " | Gênero: " +cd[3].getGenero() + " | Preço: " + cd[3].getPreco());
                    System.out.println("Albúm 5: " +cd[4].getNome() + " | Gênero: " +cd[4].getGenero() + " | Preço: " + cd[4].getPreco());
                        System.out.println("Gostou de alguma música? 1 = Sim | 2 = Não");
                        int resp1 = leitor.nextInt();
                        if(resp1 == 1){
                            System.out.println("Digite o número da música que gostou para saber mais sobre ela, como: Cantor/Cantora, Faixas ");
                            int esc1 = leitor.nextInt();
                                System.out.println(cd[esc1-1].Faixas().get(esc1-1));
                                System.out.println("Deseja escolher essa música? 1 = Sim | 2 = Não");   
                                    int dec1 = leitor.nextInt();
                                        if(dec1 == 1){
                                            System.out.println("ALBUM LOCADO!");
                                        }else break;
                        }else break;
                break; 
                
                case 3:
                    System.out.println("Vídeo 1: " +vhs[0].getVideo() + " | Fita rebobinada: " +vhs[0].isRodando());
                    System.out.println("Vídeo 2: " +vhs[1].getVideo() + " | Fita rebobinada: " +vhs[1].isRodando());
                    System.out.println("Vídeo 3: " +vhs[2].getVideo() + " | Fita rebobinada: " +vhs[2].isRodando());
                    System.out.println("Vídeo 4: " +vhs[3].getVideo() + " | Fita rebobinada: " +vhs[3].isRodando());
                    System.out.println("Vídeo 5: " +vhs[4].getVideo() + " | Fita rebobinada: " +vhs[4].isRodando());
                        System.out.println("Deseja locar qual vídeo: ");
                            int resp2 = leitor.nextInt();
                            if((resp2 == 1) && (vhs[0].isRodando() == false)){
                                System.out.print("Rebobinando a fita...");
                                System.out.println("Fita Rebobinada");
                                System.out.println("FITA LOCADA!!!");
                            }
                            else if ((resp2 == 1) && (vhs[0].isRodando() == true)) {
                                System.out.println("FITA LOCADA!!!");
                            }
                            else
                            
                            if((resp2 == 2) && (vhs[1].isRodando() == false)){
                                System.out.print("Rebobinando a fita...");
                                System.out.println("Fita Rebobinada");
                                System.out.println("FITA LOCADA!!!");
                            }
                            else if ((resp2 == 2) && (vhs[1].isRodando() == true)) {
                                System.out.println("FITA LOCADA!!!");
                            }
                            else 
                            if((resp2 == 3) && (vhs[2].isRodando() == false)){
                                System.out.print("Rebobinando a fita...");
                                System.out.println("Fita Rebobinada");
                                System.out.println("FITA LOCADA!!!");
                            }
                            else if ((resp2 == 3) && (vhs[2].isRodando() == true)) {
                                System.out.println("FITA LOCADA!!!");
                            }
                            else 
                            if((resp2 == 4) && (vhs[3].isRodando() == false)){
                                System.out.print("Rebobinando a fita...");
                                System.out.println("Fita Rebobinada");
                                System.out.println("FITA LOCADA!!!");
                            }
                            else if ((resp2 == 4) && (vhs[3].isRodando() == true)) {
                                System.out.println("FITA LOCADA!!!");
                            }
                            else 
                            if((resp2 == 5) && (vhs[4].isRodando() == false)){
                                System.out.print("Rebobinando a fita...");
                                System.out.println("Fita Rebobinada");
                                System.out.println("FITA LOCADA!!!");
                            }
                            else if ((resp2 == 5) && (vhs[4].isRodando() == true)) {
                                System.out.println("FITA LOCADA!!!");
                            }
                            else break;                          
            }
        }    
    }
}