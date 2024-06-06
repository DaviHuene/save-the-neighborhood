package jogo;

import jplay.URL;

public class Npc1 extends Ator{
	
	private double ataque = 1;
	public Npc1(int x ,int y) {
		super(URL.sprite("pmp.png"), 16);
		this.x=x;
		this.y=y;
		this.setTotalDuration(2000);
		this.velocidade = 0.1;
	}
   
	public void perseguir(double x ,double y) {
		     if(this.x > x && this.y <=y + 50 && this.y >= y - 50) {
		    	 moveTo(x,y,velocidade);
		    	 if(direcao !=1) {
		    		setSequence(5,8);
		    		 direcao =1; 
		    	 }
		    	 movendo=true;
		     }
		     else if(this.x < x && this.y <=y + 50 && this.y >= y - 50) {
		    	    moveTo(x,y,velocidade);
		    	    if(direcao !=2) {
		    	    	setSequence(9,12);
		    	    	direcao=2;
		    	    }
		    	    movendo = true; 
		     }
		     else if (this.y>y) {
		    	 moveTo(x,y,velocidade);
		    		if(direcao !=4) {
		    			setSequence(13,16);
		    			direcao=4;
		    		}
		    		movendo = true;
		    	 
		     }
		     else if (this.y < y) {
		    	 moveTo(x,y,velocidade);
		    		if(direcao !=5) {
		    			setSequence(1,4);
		    			direcao=5;
		    		}
		    		movendo = true;
		     }
		     if(movendo) {  
		    	 update();
		    	 movendo =false;
		     }
	}

	public void morrer() {
		// TODO Auto-generated method stub
		if(this.energia <= 0) {
			this.velocidade = 0;
			this.ataque = 0;
			this.direcao = 0;
			this.movendo = false;
			this.x = -900;
			return;
		}
		
	}
	public void atacar(Jogador jogador ) {
		if(this.collided(jogador)) {
			Jogador.energia -= this.ataque;
		}
		
		
		
	}

	
}
