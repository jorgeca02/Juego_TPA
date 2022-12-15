package juego.tpa.entities.creatures;

import java.awt.Graphics;

import juego.tpa.Handler;
import juego.tpa.Tick;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public class DekuLink extends Player implements Tick {
	public DekuLink(Handler handler, float x, float y) {
		super(handler, x, y);
		walkDown= new Animation(200,Assets.dekuDown);
		walkUp= new Animation(200,Assets.dekuUp);
		walkLeft= new Animation(200,Assets.dekuLeft);
		walkRight= new Animation(200,Assets.dekuRight);
		lastFrame=Assets.standingDeku;
		speed=4;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int)x,(int)y,width,height,null);
	}
	
	
}
