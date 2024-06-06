 package jogo;

import jplay.Sound;
import jplay.URL;

public class Som {	
	
	// Declaração de um objeto estático da classe Sound para armazenar a música
	private static Sound musica;
	
	// Método estático para iniciar a reprodução de uma música
	public static void play(String audio) {
		stop();
		// Cria um novo objeto Sound com o URL do arquivo de áudio fornecido
		musica = new Sound(URL.audio(audio));
	
		// Inicia a reprodução da música
		Som.musica.play();
		// Configura a música para repetir indefinidamente
		Som.musica.setRepeat(true);
	}
	
	// Método estático para parar a reprodução da música
	public static void stop() {
		// Verifica se a música está sendo reproduzida
		if(Som.musica != null) {
			// Para a reprodução da música
			musica.stop();
		}
	}
}
