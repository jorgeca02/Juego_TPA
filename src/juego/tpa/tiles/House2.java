package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class House2 extends Tile{
	public House2(int id) {
		super(Assets.house2, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 24*14, 24*7+12, null);
	}
	public boolean isSolid(){
		return true;
	}
}
