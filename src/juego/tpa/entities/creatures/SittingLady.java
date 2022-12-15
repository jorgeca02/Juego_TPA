package juego.tpa.entities.creatures;

import java.awt.Graphics;

import juego.tpa.Handler;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;

public class SittingLady extends NPC {

	public SittingLady(Handler handler, float x, float y, String camino) {
		super(handler, x, y, camino);
		lastFrame=Assets.sittingLady;
		}
		
	
	public void render(Graphics g) {
		g.drawImage(lastFrame,24*(int)x,24*(int)y,24,48,null);
	}

}
