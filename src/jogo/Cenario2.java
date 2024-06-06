package jogo;

import jplay.Window;
import jplay.Scene;
import jplay.URL;
import jplay.Keyboard;

public class Cenario2 extends Cenario { 
    private Window janela;
    private Scene cena;
    private Jogador jogador;
    private Keyboard teclado;
    private Npc1 npc[];

    public Cenario2(Window window) {
        janela = window;
        cena = new Scene();
        cena.loadFromFile(URL.scenario("cenario1.scn"));
        jogador = new Jogador(200,80);
        teclado = janela.getKeyboard();
        npc = new Npc1[15];

       
        run();
    }
    
   
    private void run() {
    	
        // Inicialização dos NPCs
        for (int i = 0; i < npc.length; i++) {
            npc[i] = new Npc1(20 * i, 200 * i);
        }

        while (true) {
        	 if(npc[14].energia <= 0) {
        		 new Nxt2(janela);
        		 janela.update();
        	 }
            // Atualização do jogador
            jogador.controle(janela, teclado);
            jogador.caminho(cena);
            jogador.x += cena.getXOffset();
            jogador.y += cena.getYOffset();

            // Atualização dos NPCs
            for (int i = 0; i < npc.length; i++) {
                jogador.atirar(janela, cena, teclado, npc[i]);
                npc[i].morrer();
                npc[i].atacar(jogador);
                npc[i].x += cena.getXOffset();
                npc[i].y += cena.getYOffset();
                npc[i].caminho(cena);
               npc[i].perseguir(jogador.x, jogador.y);
                npc[i].draw();
            }

            // Desenho do jogador
            jogador.mover(janela, teclado);
            jogador.draw();

            // Atualização da janela e da cena
            janela.update();
            cena.moveScene(jogador);

            // Verificação de mudança de cenário
           
            jogador.energia(janela);
            
           
          
            
        }
    }
    
    }

 

