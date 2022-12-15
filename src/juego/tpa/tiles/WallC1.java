package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class WallC1 extends Tile {
	public WallC1(int id) {
		super(Assets.wallC1, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 36, null);
	}
	public boolean isSolid(){
		return true;
	}
}
