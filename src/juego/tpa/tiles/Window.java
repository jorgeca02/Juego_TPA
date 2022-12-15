package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Window extends Tile {
	public Window(int id) {
		super(Assets.window, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
