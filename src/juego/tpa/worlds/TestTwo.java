package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.entities.EntityManager;
import juego.tpa.entities.creatures.EasterEgg;
import juego.tpa.entities.creatures.Musician;

public class TestTwo extends World {
	public TestTwo(Handler handler) {
		super(handler, "/maps/testTwo.txt");
		entityManager=new EntityManager(1);
		transitionTiles=new TransitionTile[1];
		transitionTiles[0]=new TransitionTile(34, 3, 3, 1,35,5);
		transitionTiles[0].destination=WorldList.test;
		entityManager.add(new EasterEgg(handler, 15, 18));
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.test;
	}
}
