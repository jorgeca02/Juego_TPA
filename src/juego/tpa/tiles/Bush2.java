package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Bush2 extends Tile {
	public Bush2(int id) {
		super(Assets.bush2, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 24, 48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
