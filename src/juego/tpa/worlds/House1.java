package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.tiles.Tile;

public class House1 extends World {
  
	public House1(Handler handler) {
		super(handler, "/maps/house1.txt");
		defaultTile=Tile.black;
		transitionTiles=new TransitionTile[1]; 
		transitionTiles[0]=new TransitionTile(23, 20, 2, 1, 16, 23);
		transitionTiles[0].destination=WorldList.pueblo;
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo;
	}
}


