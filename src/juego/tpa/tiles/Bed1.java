package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Bed1 extends Tile{
	public Bed1(int id) {
		super(Assets.bed1, id);
		renderOrder=2;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 48, 24, null);
	}
}
