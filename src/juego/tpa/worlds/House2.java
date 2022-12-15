package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.tiles.Tile;

public class House2 extends World {
  
	public House2(Handler handler) {
		super(handler, "/maps/house1.txt");
		defaultTile=Tile.black;
		transitionTiles=new TransitionTile[1]; 
		transitionTiles[0]=new TransitionTile(23,20, 2, 1, 13, 10 );
		transitionTiles[0].destination=WorldList.pueblo;
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo;
	}
}


