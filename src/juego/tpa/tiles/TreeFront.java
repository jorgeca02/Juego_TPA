package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class TreeFront extends Tile {
	public TreeFront(int id) {
		super(Assets.treeFront1, id);
		front=true;
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 96, 48, null);
	}
}
