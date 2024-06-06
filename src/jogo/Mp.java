
package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Mp extends Cenario{
	   private Window janela;
	    private Keyboard teclado;
	 
	    public Mp (Window window) {
	        janela = window;
	        new Scene();
	        GameImage plano = new GameImage(URL.sprite("mpl.png"));
	       
	        teclado = janela.getKeyboard();
	        Som.play("A Violent Encounter - [Trilha Sonora] Shadow of The Colossus.wav");
	       
 
	       
	     
	    while (true) {
            // Draw the background image of the menu
            plano.draw();
            // Update the window
           janela.update();

            // Check if the "Enter" key was pressed
            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                // If so, start the first scene of the game
            	 new Cenario2(janela);
            	 janela.update();
             // new  ();
            }
	    }
	    }

}
	        
	 

