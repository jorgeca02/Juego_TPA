package juego.tpa.entities.creatures;

import java.awt.Graphics;
import java.awt.Rectangle;

import juego.tpa.Handler;
import juego.tpa.Tick;
import juego.tpa.gfx.Animation;
import juego.tpa.gfx.Assets;


	public class GoronLink extends Player implements Tick{

		public GoronLink(Handler handler, float x, float y) {
			super(handler, x, y);
			width=39;
			height=45;
			speed=2;
			bounds= new Rectangle(0,20,width,height-20);
			walkDown= new Animation(200,Assets.goronDown);
			walkUp= new Animation(200,Assets.goronUp);
			walkLeft= new Animation(200,Assets.goronLeft);
			walkRight= new Animation(200,Assets.goronRight);
			lastFrame=Assets.standingGoron;
		}
		
		public void render(Graphics g) {
			g.drawImage(getCurrentAnimationFrame(),(int)x,(int)y,39,45,null);
		}
		}
		
	
	
