package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.entities.EntityManager;
import juego.tpa.entities.creatures.Musician;

public class Pueblo2 extends World {

	public Pueblo2(Handler handler) {
		super(handler, "/maps/pueblo2.txt");
		entityManager=new EntityManager(1);
		transitionTiles=new TransitionTile[2];
		transitionTiles[0]=new TransitionTile(1, 29, 40, 1, 1, 2);
		transitionTiles[0].destination=WorldList.pueblo;
		transitionTiles[0].transitionBorderX=true;
		transitionTiles[1]=new TransitionTile(40, 1, 1, 30, 2, 2);
		transitionTiles[1].destination=WorldList.pueblo4;
		transitionTiles[1].transitionBorderY=true;
		entityManager.add(new Musician(handler, 12, 9));
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo;
		transitionTiles[1].destination=WorldList.pueblo4;
	}
}


