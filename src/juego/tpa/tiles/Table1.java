package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Table1 extends Tile {
	public Table1(int id) {
		super(Assets.table1, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 72, 48, null);
	}
	public boolean isSolid(){
		return true;
	}
}
