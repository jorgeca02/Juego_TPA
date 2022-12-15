package juego.tpa.states;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Game;
import juego.tpa.Handler;
import juego.tpa.Tick;
import juego.tpa.display.ImageButton;
import juego.tpa.entities.creatures.DekuLink;
import juego.tpa.entities.creatures.GoronLink;
import juego.tpa.entities.creatures.Link;
import juego.tpa.gfx.ImageLoader;

public class CharacterState extends State implements Tick {
    private BufferedImage wallpaper,link,deku,goron;
    private ImageButton linkButton,dekuButton,goronButton;
	public CharacterState(Handler handler) {
		super(handler);
		wallpaper= ImageLoader.loadImage("/textures/CharacterWallpaper.png");
		link= ImageLoader.loadImage("/textures/LinkButton.png");
	    linkButton=new ImageButton(169, 395, 150, 150, link, handler);
	    deku= ImageLoader.loadImage("/textures/DekuButton.png");
	    dekuButton=new ImageButton(661, 395, 150, 150, deku, handler);
	    goron= ImageLoader.loadImage("/textures/GoronButton.png");
	    goronButton=new ImageButton(415, 395, 150, 150, goron,handler);
	}

	@Override
	public void tick() {
		if(linkButton.click()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			handler.getGame().getGameState().player =new Link(handler,396,310);
			State.setState(handler.getGame().getMenuState());
		}
		if(dekuButton.click()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			handler.getGame().getGameState().player =new DekuLink(handler,396,310);
			State.setState(handler.getGame().getMenuState());
		}
		if(goronButton.click()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			handler.getGame().getGameState().player =new GoronLink(handler,496,410);
			State.setState(handler.getGame().getMenuState());
		}
	}

	@Override
	public void render(Graphics g) {

		g.drawImage(wallpaper,0,0,984,720,null);
	    linkButton.render(g);
	    dekuButton.render(g);
	    goronButton.render(g);
		
	}

}
