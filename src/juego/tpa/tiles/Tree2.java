package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Tree2 extends Tile {
	public Tree2(int id) {
		super(Assets.tree2, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 96, 120, null);
	}
	public boolean isSolid(){
		return true;
	}
}
