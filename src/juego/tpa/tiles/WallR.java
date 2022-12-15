package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class WallR extends Tile {
	public WallR(int id) {
		super(Assets.wallR, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 36, 24, null);
	}
	public boolean isSolid(){
		return true;
	}
}
