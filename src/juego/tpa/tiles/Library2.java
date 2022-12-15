package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Library2 extends Tile {
	public Library2(int id) {
		super(Assets.library2, id);

		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 120, 24, null);
	}
}
