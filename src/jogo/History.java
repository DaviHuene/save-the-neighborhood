
package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class History extends Cenario{
	   private Window janela;
	    private Keyboard teclado;
	 
	    public History (Window window) {
	        janela = window;
	        new Scene();
	        GameImage plano = new GameImage(URL.sprite("historia.png"));
	       
	        teclado = janela.getKeyboard();
	        
	       
 
	       
	     
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
	        
	 



