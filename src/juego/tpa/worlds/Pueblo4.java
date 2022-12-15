package juego.tpa.worlds;

import juego.tpa.Handler;

public class Pueblo4 extends World {

	public Pueblo4(Handler handler) {
		super(handler, "/maps/pueblo4.txt");
		transitionTiles=new TransitionTile[3];
		transitionTiles[0]=new TransitionTile(1, 1, 1, 30,39, 2);
		transitionTiles[0].destination=WorldList.pueblo2;
		transitionTiles[0].transitionBorderY=true;
		transitionTiles[1]=new TransitionTile(1, 29, 40, 1,39, 2);
		transitionTiles[1].destination=WorldList.pueblo3;
		transitionTiles[1].transitionBorderX=true;
		transitionTiles[2]=new TransitionTile(15, 11, 2, 1,24, 20);
		transitionTiles[2].destination=WorldList.house5;
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.pueblo2;
		transitionTiles[1].destination=WorldList.pueblo3;
		transitionTiles[2].destination=WorldList.house5;
	}
}


