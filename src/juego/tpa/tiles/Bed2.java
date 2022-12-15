package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Bed2 extends Tile{
	public Bed2(int id) {
		super(Assets.bed2, id);
		renderOrder=2;
		front=true;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 24, null);
	}
	
}
