package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class Pajaro extends Tile {
	public Pajaro(int id) {
		super(Assets.pajaro, id);
		front=true;
		renderOrder=3;
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, 60, 48, null);
	}
}
