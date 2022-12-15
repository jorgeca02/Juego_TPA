package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Tree1 extends Tile {
	public Tree1(int id,boolean front_) {
		super(Assets.tree1, id);
		front=front_;
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 96, 120, null);
	}
	public boolean isSolid(){
		return true;
	}
}
