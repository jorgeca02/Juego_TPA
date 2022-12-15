package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class WallU extends Tile {
	public WallU(int id) {
		super(Assets.wallU, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 24, 36, null);
	}
	public boolean isSolid(){
		return true;
	}
}
