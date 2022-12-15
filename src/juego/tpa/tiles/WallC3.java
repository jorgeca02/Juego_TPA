package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class WallC3 extends Tile {
	public WallC3(int id) {
		super(Assets.wallC3, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
