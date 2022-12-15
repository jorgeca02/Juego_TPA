package juego.tpa.tiles;

import juego.tpa.gfx.Assets;

public class WallL2 extends Tile {
	public WallL2(int id) {
		super(Assets.wallL2, id);
	}
	public boolean isSolid(){
		return true;
	}
}
