package juego.tpa.worlds;

import juego.tpa.Handler;

public class Pueblo extends World {

	public Pueblo(Handler handler) {
		super(handler, "/maps/pueblo.txt");
		transitionTiles=new TransitionTile[8];
		transitionTiles[0]=new TransitionTile(1, 1, 1, 30, 39, 15);
		transitionTiles[0].destination=WorldList.test;
		transitionTiles[1]=new TransitionTile(1, 0, 40, 1, 1, 29);
		transitionTiles[1].destination=WorldList.pueblo2;
		transitionTiles[1].transitionBorderX=true;
		transitionTiles[2]=new TransitionTile(40, 0, 1, 30, 2, 1);
		transitionTiles[2].destination=WorldList.pueblo3;
		transitionTiles[2].transitionBorderY=true;
		transitionTiles[3]=new TransitionTile(16, 22, 3, 1, 24, 20);
		transitionTiles[3].destination=WorldList.house1;
		transitionTiles[4]=new TransitionTile(12, 8, 3, 1, 24, 20);
		transitionTiles[4].destination=WorldList.house2;
		transitionTiles[5]=new TransitionTile(20, 8, 3, 1, 24, 20);
		transitionTiles[5].destination=WorldList.house3;
		transitionTiles[6]=new TransitionTile(25, 21, 3, 1, 14, 20);
		transitionTiles[6].destination=WorldList.house6;
		transitionTiles[7]=new TransitionTile(29, 21, 3, 1, 21, 19);
		transitionTiles[7].destination=WorldList.house6;
	}
	public void destinationTick() {
		transitionTiles[0].destination=WorldList.test;
		transitionTiles[1].destination=WorldList.pueblo2;
		transitionTiles[2].destination=WorldList.pueblo3;
		transitionTiles[3].destination=WorldList.house1;
		transitionTiles[4].destination=WorldList.house2;
		transitionTiles[5].destination=WorldList.house3;
		transitionTiles[6].destination=WorldList.house6;
		transitionTiles[7].destination=WorldList.house6;
	}
}


