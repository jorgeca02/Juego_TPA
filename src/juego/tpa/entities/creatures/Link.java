package juego.tpa.entities.creatures;

import juego.tpa.Handler;
import juego.tpa.Tick;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public class Link extends Player implements Tick{

	public Link(Handler handler, float x, float y) {
		super(handler, x, y);
		walkDown= new Animation(200,Assets.linkDown);
		walkUp= new Animation(200,Assets.linkUp);
		walkLeft= new Animation(200,Assets.linkLeft);
		walkRight= new Animation(200,Assets.linkRight);
		lastFrame=Assets.standingLink;
		speed=4;
	}
}
