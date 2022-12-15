package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Bush3 extends Tile {
	public Bush3(int id) {
		super(Assets.bush3, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 24, 48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
