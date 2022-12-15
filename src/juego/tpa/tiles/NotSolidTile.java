package juego.tpa.tiles;

import java.awt.image.BufferedImage;

public class NotSolidTile extends Tile{
	public NotSolidTile(int id,BufferedImage texture) {
		super(texture, id);
	}
	public NotSolidTile(int id,BufferedImage texture,int i) {
		super(texture, id);
		renderOrder=i;
	}
}
