package juego.tpa.tiles;

import java.awt.image.BufferedImage;

public class SolidTile extends Tile{
	public SolidTile(int id,BufferedImage texture) {
		super(texture, id);
	}
	public SolidTile(int id,BufferedImage texture,int i) {
		super(texture, id);
		renderOrder=i;
	}
	public boolean isSolid(){
		return true;
	}
}
