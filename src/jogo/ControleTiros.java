package jogo;

import java.util.Iterator;
import java.util.LinkedList;

import jplay.Scene;
import jplay.Sound;
import jplay.URL;

public class ControleTiros {
    LinkedList<Tiro> tiros = new LinkedList<>();

    public void adicionaTiro(double x, double y, int caminho, Scene cena) {
        Tiro tiro = new Tiro(x, y, caminho);
        tiros.addFirst(tiro);
        cena.addOverlay(tiro);
        somDisparo();
    }

    public void run(Ator inimigo) {
        Iterator<Tiro> iterator = tiros.iterator();
        while (iterator.hasNext()) {
            Tiro tiro = iterator.next();
            tiro.mover();

            if (tiro.collided(inimigo)) {
                tiro.x = -1000;  // Move the bullet off-screen
                inimigo.energia -= 2;
                iterator.remove();
            }
        }
    }

    private void somDisparo() {
        new Sound(URL.audio("TIRO-DE-PISTOLA-SOM-EFEITO__-_64_-_1_ (mp3cut.net).wav")).play();
    }
}
