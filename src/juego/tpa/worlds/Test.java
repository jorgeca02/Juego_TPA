package juego.tpa.worlds;

import juego.tpa.Handler;

public class Test extends World{

	public Test(Handler handler) {
		super(handler, "/maps/test.txt");
		transitionTiles=new TransitionTile[2];
		transitionTiles[0]=new TransitionTile(34, 3, 3, 1,35,5);
		transitionTiles[0].destination=WorldList.testTwo;
		transitionTiles[1]=new TransitionTile(40, 1, 1, 40, 2, 12);
		transitionTiles[1].destination=WorldList.pueblo;
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.testTwo;
		transitionTiles[1].destination=WorldList.pueblo;
	}
}
