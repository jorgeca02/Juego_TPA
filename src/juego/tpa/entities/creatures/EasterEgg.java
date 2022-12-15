package juego.tpa.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Handler;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public class EasterEgg extends NPC {

	public EasterEgg(Handler handler, float x, float y) {
		super(handler, 24*x, 24*y, null);
		lastFrame=Assets.easterEgg[1];
		walkDown= new Animation(90,Assets.easterEgg);
		walkUp= new Animation(900,Assets.easterEgg);
		walkLeft= new Animation(900,Assets.easterEgg);
		walkRight= new Animation(900,Assets.easterEgg);
		
	}
	public void tick() {
		animTick();
	}
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int)x,(int)y,300,200,null);
	}
		protected BufferedImage getCurrentAnimationFrame(){
			return walkDown.getCurrentFrame();
		}
	}


