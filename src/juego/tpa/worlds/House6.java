package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.entities.EntityManager;
import juego.tpa.entities.creatures.Musician;
import juego.tpa.entities.creatures.NPC;
import juego.tpa.entities.creatures.SittingLady;
import juego.tpa.tiles.Tile;

public class House6 extends World {
  
	public House6(Handler handler) {
		super(handler, "/maps/house2.txt");
		defaultTile=Tile.black;
		entityManager=new EntityManager(2);
		transitionTiles=new TransitionTile[2]; 
		transitionTiles[0]=new TransitionTile(13, 20, 3, 1,25, 22);
		transitionTiles[0].destination=WorldList.pueblo;
		transitionTiles[1]=new TransitionTile(19, 20, 3, 1,31, 22);
		transitionTiles[1].destination=WorldList.pueblo;
		entityManager.add(new SittingLady(handler, 24, 14, null));
		entityManager.add(new SittingLady(handler, 19, 14, null));
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo;
		transitionTiles[1].destination=WorldList.pueblo;
	}
}


