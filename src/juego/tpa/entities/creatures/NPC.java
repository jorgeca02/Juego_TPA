package juego.tpa.entities.creatures;

import juego.tpa.Handler;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public abstract class NPC extends Creature{
	private Handler handler;
	private String camino;
	private boolean walking=true;
	private int tickPointer,caminoIndex;
	private float xPointer,yPointer;
	private char direction;
	public NPC(Handler handler, float x, float y,String camino) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.handler=handler;
		xPointer=x;
		yPointer=y;
		tickPointer= (int)Math.floor(Math.random()*(55-1+1)+1);
		speed=1;
		this.camino=camino;
		if (camino!=null) {
		direction=camino.charAt(caminoIndex);
		walking=false;
				}
	}
	
	public void tick() {
		if (camino==null) {
			
		}
		else {
		if(walking) {
			animTick();
		if(x==xPointer+24||x==xPointer-24||y==yPointer+24||y==yPointer-24) {
			walking=false;
			tickPointer=handler.getGame().ticks;
			
		}
		else {	
			move();
		}
		}
		else {
			if(tickPointer==handler.getGame().ticks) {
				walking=true;
				directionUpdate();
				animTick();
				xPointer=x;
				yPointer=y;
			}
		}
		
		setDirection();
		}
	}

	private void directionUpdate() {
		if(caminoIndex==0){
			direction=camino.charAt(caminoIndex+1);
			caminoIndex++;
		}
		else if(caminoIndex==camino.length()-1) {
			lastDirection();
			caminoIndex--;
			
		}
		else {
		int random_int = (int)Math.floor(Math.random()*(1-0+1)+0);
		if(random_int==0) {
			direction=camino.charAt(caminoIndex+1);
			caminoIndex++;
		}
		else {
			lastDirection();
			caminoIndex--;
		}
		}
		
	}
	private void setDirection() {
		xMove=0;
		yMove=0;
		if(direction=='u') {
			yMove=-speed;
		}
		if(direction=='d') {
			yMove=speed;
		}
		if(direction=='l') {
			xMove=-speed;
		}
		if(direction=='r') {
			xMove=+speed;
		}
	}
	private void lastDirection(){
		switch(camino.charAt(caminoIndex)) {
		case 'u':
			direction='d';
			break;
		case 'd':
			direction='u';
			break;
		case 'r':
			direction='l';
			break;
		case 'l':
			direction='r';
			break;
		}
	}

}
