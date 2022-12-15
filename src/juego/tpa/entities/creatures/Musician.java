package juego.tpa.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Handler;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public class Musician extends NPC {

	public Musician(Handler handler, float x, float y) {
		super(handler, 24*x, 24*y, null);
		lastFrame=Assets.musician[1];
		walkDown= new Animation(400,Assets.musician);
		walkUp= new Animation(400,Assets.musician);
		walkLeft= new Animation(400,Assets.musician);
		walkRight= new Animation(400,Assets.musician);
		
	}
	public void tick() {
		animTick();
	}
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int)x,(int)y,24,36,null);
	}
		protected BufferedImage getCurrentAnimationFrame(){
			return walkDown.getCurrentFrame();
		}
	}


