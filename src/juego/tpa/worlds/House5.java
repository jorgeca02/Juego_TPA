package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.entities.EntityManager;
import juego.tpa.entities.creatures.NPC;
import juego.tpa.tiles.Tile;

public class House5 extends World {
  
	public House5(Handler handler) {
		super(handler, "/maps/house1.txt");
		defaultTile=Tile.black;
		transitionTiles=new TransitionTile[1]; 
		transitionTiles[0]=new TransitionTile(23, 20, 2, 1, 15, 12);
		transitionTiles[0].destination=WorldList.pueblo4;
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo4;
	}
}


