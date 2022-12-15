package juego.tpa.tiles;

import juego.tpa.gfx.Assets;

public class DefaultSolidGrass extends Tile {
	public DefaultSolidGrass(int id) {
		super(Assets.defaultGrass, id);
	}
	public boolean isSolid(){
		return true;
	}
}
