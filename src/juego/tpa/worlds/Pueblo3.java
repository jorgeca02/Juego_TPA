package juego.tpa.worlds;

import juego.tpa.Handler;
import juego.tpa.entities.EntityManager;
import juego.tpa.entities.creatures.Korok;
import juego.tpa.entities.creatures.NPC;

public class Pueblo3 extends World {
    
	public Pueblo3(Handler handler) {
		super(handler, "/maps/pueblo3.txt");
		entityManager=new EntityManager(8);
		transitionTiles=new TransitionTile[2];
		transitionTiles[0]=new TransitionTile(1, 1, 1, 30,39, 2);
		transitionTiles[0].destination=WorldList.pueblo;
		transitionTiles[0].transitionBorderY=true;
		transitionTiles[1]=new TransitionTile(1, 1, 40, 1,39, 29);
		transitionTiles[1].destination=WorldList.pueblo4;
		transitionTiles[1].transitionBorderX=true;
		entityManager.add(new Korok(handler,18*24,10*24,null,1));
		entityManager.add(new Korok(handler,18*24,12*24,null,2));
		entityManager.add(new Korok(handler,17*24,11*24,null,3));
		entityManager.add(new Korok(handler,19*24,11*24,null,4));
		entityManager.add(new Korok(handler,16*24,8*24,"lluuulluurrdd",5));
		entityManager.add(new Korok(handler,18*24,16*24,"rrruuurrrddrruull",6));
		entityManager.add(new Korok(handler,18*24,27*24,"llllllll",6));
		entityManager.add(new Korok(handler,8*24,27*24,"llulllll",5));
		entityManager.add(new Korok(handler,8*24,8*24,"llddrulll",5));
		entityManager.add(new Korok(handler,14*24,12*24,"uuullldduurulluu",6));
		
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo;
		transitionTiles[1].destination=WorldList.pueblo4;
	}
}


