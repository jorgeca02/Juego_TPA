package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Plaza extends Tile {
	public Plaza(int id) {
		super(Assets.plaza, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 196, 360, null);
	}
	public boolean isSolid(){
		return true;
	}
}
