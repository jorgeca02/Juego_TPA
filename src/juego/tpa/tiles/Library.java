package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Library extends Tile {
	public Library(int id) {
		super(Assets.library, id);
		front=true;
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 120, 7*24, null);
	}
}
