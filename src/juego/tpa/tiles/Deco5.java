package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Deco5 extends Tile {
	public Deco5(int id) {
		super(Assets.deco5, id);
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 60, null);
	}
	public boolean isSolid(){
		return true;
	}
}
