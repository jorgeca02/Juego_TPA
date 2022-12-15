package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class TreeFront2 extends Tile {
	public TreeFront2(int id) {
		super(Assets.treeFront2, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 96, 120-48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
