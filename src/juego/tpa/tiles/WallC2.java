package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class WallC2 extends Tile {
	public WallC2(int id) {
		super(Assets.wallC2, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
