package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class LostWoodLogCenter extends Tile{
	public LostWoodLogCenter(int id) {
		super(Assets.lostWoodsLogCenter, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 72, 72, null);
	}
}
