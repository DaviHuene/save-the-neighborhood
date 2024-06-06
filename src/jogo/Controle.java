package jogo;

import jplay.GameObject;
import jplay.TileInfo;

public class Controle {
	
	// Método para verificar colisão entre um objeto e um tile
	public boolean colisao(GameObject obj, TileInfo tile) {
		// Verifica se o ID do tile é maior ou igual a 11 (representando um tile sólido)
		// e se há colisão entre o objeto e o tile
		if ((tile.id >= 9) && obj.collided(tile)) {
			return true; // Retorna true se houver colisão
		}
		return false; // Retorna false se não houver colisão
	}
}
