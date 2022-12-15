package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Table2 extends Tile {
	public Table2(int id) {
		super(Assets.table2, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 36, null);
	}
	public boolean isSolid(){
		return true;
	}
}
