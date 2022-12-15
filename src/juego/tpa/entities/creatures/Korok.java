package juego.tpa.entities.creatures;

import java.awt.Graphics;

import juego.tpa.Handler;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public class Korok extends NPC {

	public Korok(Handler handler, float x, float y, String camino,int n) {
		super(handler, x, y, camino);
		switch(n) {
		case 1:
			lastFrame=Assets.standingKorok1;
			break;
		case 2:
			lastFrame=Assets.standingKorok2;
			break;
		case 3:
			lastFrame=Assets.standingKorok3;
			break;
		case 4:
			lastFrame=Assets.standingKorok4;
			break;
		case 5:
			walkDown= new Animation(400,Assets.korok5Down);
			walkUp= new Animation(400,Assets.korok5Up);
			walkLeft= new Animation(400,Assets.korok5Left);
			walkRight= new Animation(400,Assets.korok5Right);
			lastFrame=Assets.korok5Down[1];
			break;
		case 6:
		walkDown= new Animation(400,Assets.korok6Down);
		walkUp= new Animation(400,Assets.korok6Up);
		walkLeft= new Animation(400,Assets.korok6Left);
		walkRight= new Animation(400,Assets.korok6Right);
		lastFrame=Assets.korok5Down[1];
		break;
		}
		
	}
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int)x,(int)y,25,43,null);
	}

}
