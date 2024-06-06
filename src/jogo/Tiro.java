package jogo;

import jplay.Sprite;
import jplay.URL;

public class Tiro extends Sprite {

    public static final int LEFT = 1, RIGHT = 2, STOP = 3, UP = 4, DOWN = 5;

    protected static final int VELOCIDADE_TIRO = 5;
    protected int caminho = STOP;
    protected boolean movendo = false;
    protected int direcao = STOP;

    public Tiro(double x, double y, int caminho) {
        super(URL.sprite("1715227449233.png"), 12);
        this.caminho = caminho;
        this.x = x;
        this.y = y;
    }

    public void mover() {
        if (caminho == LEFT) {
            this.x -= VELOCIDADE_TIRO;
            if (direcao != LEFT) {
                setSequence(3, 6);
                direcao = LEFT;
            }
            movendo = true;
        }
        if (caminho == RIGHT) {
            this.x += VELOCIDADE_TIRO;
            if (direcao != RIGHT) {
                setSequence(6, 9);
                direcao = RIGHT;
            }
            movendo = true;
        }
        if (caminho == UP) {
            this.y -= VELOCIDADE_TIRO;
            if (direcao != UP) {
                setSequence(9, 12);
                direcao = UP;
            }
            movendo = true;
        }
        if (caminho == DOWN) {
            this.y += VELOCIDADE_TIRO;
            if (direcao != DOWN) {
                setSequence(0, 3);
                direcao = DOWN;
            }
            movendo = true;
        }
        if (caminho == STOP) {
            movendo = false;
        }
        if (movendo) {
            update();
        }
    }
}
