package juego.tpa.worlds;

import juego.tpa.tiles.Tile;

public class TransitionTile {
public int x,y,width,height,xSpawn,ySpawn;
public World destination;
public TransitionTile(int x, int y, int width, int height, int xSpawn, int ySpawn) {
	this.x = x*Tile.TILEWIDTH;
	this.y = y*Tile.TILEHEIGHT;
	this.width = width*Tile.TILEWIDTH;
	this.height = height*Tile.TILEHEIGHT;
	this.xSpawn = xSpawn*Tile.TILEWIDTH;
	this.ySpawn = ySpawn*Tile.TILEHEIGHT;
}
public boolean transitionBorderY = false;
public boolean transitionBorderX = false;
}
