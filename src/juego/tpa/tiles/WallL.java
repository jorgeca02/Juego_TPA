package juego.tpa.tiles;

import juego.tpa.gfx.Assets;

public class WallL extends Tile {
	public WallL(int id) {
		super(Assets.wallL, id);
		renderOrder=2;
	}
	public boolean isSolid(){
		return true;
	}
}
