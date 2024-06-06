package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class MainClass implements Runnable{

    public static void main(String[] args) {
        // Cria uma janela com dimensões 800x600
        Window janela = new Window(800, 600);
        // Carrega a imagem de fundo do menu
        GameImage plano = new GameImage(URL.sprite("menui.jpg"));
        // Obtém o teclado para detectar entrada do usuário
        Keyboard teclado = janela.getKeyboard();

        // Reproduz a música de fundo
        try {
            Som.play("Joshua McLean - Mountain Trials ♫ NO COPYRIGHT 8-bit Music.wav");
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir a música: " + e.getMessage());
        }

        // Loop principal do jogo
        while (true) {
            // Desenha a imagem de fundo do menu
            plano.draw();
            // Atualiza a janela
            janela.update();

            // Verifica se a tecla "Enter" foi pressionada
            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                // Se sim, inicia a primeira cena do jogo
                new Control(janela);
            }

                     // Verifica se a tecla "Esc" foi pressionada
            if (teclado.keyDown(Keyboard.ESCAPE_KEY)) {
                System.exit(0);
            }

            // Pequena pausa para evitar sobrecarga de CPU
            try {
                Thread.sleep(16); // Aproximadamente 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	
}
