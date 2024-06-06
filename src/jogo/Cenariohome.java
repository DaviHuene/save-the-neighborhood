package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenariohome extends Cenario { 
    private Window janela;
    private Scene cena;
    private Jogador jogador;
    private Keyboard teclado;
    
    public Cenariohome(Window window) { 
        janela = window;
        cena = new Scene();
        cena.loadFromFile(URL.scenario("home.scn"));
        jogador = new Jogador(400, 200);
        teclado = janela.getKeyboard();
        Som.play("Monplaisir - Soundtrack ♫ NO COPYRIGHT 8-bit Music.wav");

    
        run();
    }

    private void run() {

       

        while (true) {
            // Atualização do jogador
            jogador.controle(janela, teclado);
            jogador.caminho(cena);
            jogador.x += cena.getXOffset();
            jogador.y += cena.getYOffset();

         

            // Desenho do jogador
            jogador.mover(janela, teclado);
            jogador.draw();

            // Atualização da janela e da cena
            janela.update();
            cena.moveScene(jogador);

            // Verificação de mudança de cenário
            mudarCenario();
           
        }

    }

    private void mudarCenario() {
        if (tileCollision(05, jogador, cena)) {
            new Mm(janela); 
        }
    }
}
