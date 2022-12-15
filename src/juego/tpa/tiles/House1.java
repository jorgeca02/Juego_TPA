package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class House1 extends Tile{
	public House1(int id) {
		super(Assets.house1, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 24*7, 24*7+12, null);
	}
	public boolean isSolid(){
		return true;
	}
}
