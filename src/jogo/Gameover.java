
package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Gameover extends Cenario{
	   private Window janela;
	    private Keyboard teclado;
	 
	    public Gameover (Window window) {
	        janela = window;
	        new Scene();
	        GameImage plano = new GameImage(URL.sprite("go.png"));
	       
	        teclado = janela.getKeyboard();
	        
	         Som.play("Sonic 1 Music： Game Over.wav");
 
	       
	     
	    while (true) {
            // Draw the background image of the menu
            plano.draw();
            // Update the window
           janela.update();

            // Check if the "Enter" key was pressed
            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                // If so, start the first scene of the game
            	 new Cenariohome(janela);
            	 janela.update();
             // new  ();
            }
	    }
	    }

}
	        
	 

