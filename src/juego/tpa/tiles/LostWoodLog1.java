package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class LostWoodLog1 extends Tile {
	public LostWoodLog1(int id) {
		super(Assets.lostWoodsLog1, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 72, 24, null);
	}
	public boolean isSolid(){
		return true;
	}
}
