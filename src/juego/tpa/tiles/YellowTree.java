package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class YellowTree extends Tile {
	public YellowTree(int id) {
		super(Assets.yellowTree, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 24, 36, null);
	}
	public boolean isSolid(){
		return true;
	}
}
