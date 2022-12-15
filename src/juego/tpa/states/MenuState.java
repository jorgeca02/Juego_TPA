package juego.tpa.states;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Game;
import juego.tpa.Handler;
import juego.tpa.Tick;
import juego.tpa.display.ImageButton;
import juego.tpa.display.PlayButton;
import juego.tpa.gfx.ImageLoader;

public class MenuState extends State implements Tick {
    private BufferedImage wallpaper,play,play2,exit,character;
    private ImageButton playButton,exitButton,characterButton;
	public MenuState(Handler handler) {
		super(handler);
		wallpaper= ImageLoader.loadImage("/textures/Wallpaper.png");
		play= ImageLoader.loadImage("/textures/PlayButton.png");
		play2= ImageLoader.loadImage("/textures/PlayButtonBaW.png");
	    playButton=new PlayButton(169, 395, 150, 150, play,play2, handler);
	    exit= ImageLoader.loadImage("/textures/ExitButton.png");
	    exitButton=new ImageButton(661, 395, 150, 150, exit, handler);
	    character= ImageLoader.loadImage("/textures/CharacterButton.png");
	    characterButton=new ImageButton(415, 395, 150, 150, character, handler);
	}

	@Override
	public void tick() {
		if(playButton.click()&&handler.getGame().getGameState().player!=null) {
			State.setState(handler.getGame().getGameState());
		}
		if(exitButton.click()) {
			System.exit(0);
		}
		if(characterButton.click()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			State.setState(handler.getGame().getCharacterState());
		}
	}

	@Override
	public void render(Graphics g) {

		g.drawImage(wallpaper,0,0,984,720,null);
	    playButton.render(g);
	    exitButton.render(g);
	    characterButton.render(g);
	}

}
