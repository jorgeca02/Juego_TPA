package juego.tpa.worlds;

import java.awt.Graphics;

import juego.tpa.Handler;
import juego.tpa.entities.EntityManager;
import juego.tpa.tiles.Tile;
import juego.tpa.utils.Utils;

public abstract class World {
	private Handler handler;
	private int width, height;
	private int[][] tiles;
	protected TransitionTile[] transitionTiles;
	Tile defaultTile=Tile.defaultGrass;
	protected EntityManager entityManager;
	protected Utils utils;
	
	public World(Handler handler,String path){
		this.handler=handler;
		entityManager=new EntityManager(0);
		utils=new Utils();
		loadWorld(path);
		
	}
	
	public void tick(){
		checkTrans();
		destinationTick();
		entityManager.tick();
	}
	
	protected abstract void destinationTick();

	protected void checkTrans() {
		for(int i=0;i<transitionTiles.length;i++) {
			
			if(handler.getPlayer().getX()>transitionTiles[i].x-1&&handler.getPlayer().getX()<transitionTiles[i].x+transitionTiles[i].width+1) {
				if(handler.getPlayer().getY()>transitionTiles[i].y-1&&handler.getPlayer().getY()<transitionTiles[i].y+transitionTiles[i].height+1) {
					if(!transitionTiles[i].transitionBorderY) {
					handler.getPlayer().setY(transitionTiles[i].ySpawn);
					}
					if(!transitionTiles[i].transitionBorderX) {
						handler.getPlayer().setX(transitionTiles[i].xSpawn);
						}
						handler.setWorld(transitionTiles[i].destination);
				}
		}
			
		}
	}

	public void render(Graphics g){
		for(int orden=1;orden<4;orden++) {
			for(int y = 0;y < height;y++){
				for(int x = 0;x < width;x++){
					if(getTile(x, y).front==false) {
						if(getTile(x,y).renderOrder==orden) {
					
						if(getTile(x, y)!=null) {
							getTile(x, y).render(g, x * 24, y * 24);
					}	
					}else if(orden==1) {defaultTile.render(g, x * 24, y * 24);}
					}
					else if(orden==1) {defaultTile.render(g, x * 24, y * 24);}
					}
				}
		}
		entityManager.render(g);
	}
	public void renderFront(Graphics g){
		for(int orden=1;orden<4;orden++) {
			for(int y = 0;y < height;y++){
				for(int x = 0;x < width;x++){
					if(getTile(x, y).front==true&&getTile(x,y).renderOrder==orden) {
						if(getTile(x, y)!=null) {
							getTile(x, y).render(g, x * 24, y * 24);
					}
					}}
				}
		}
	}
	public Tile getTile(int x, int y){
		if(x<0||y<0||x>=width||y>=height)
			return Tile.defaultGrass;
		Tile t = Tile.tiles[tiles[x][y]];
		if (t==null) return Tile.defaultGrass;
		return t;
	}
	
	private void loadWorld(String path){
		String file = utils.loadFileAsString(path);
		String[] tokens=file.split("\\s+");
		width=Utils.parseInt(tokens[0]);
		height=Utils.parseInt(tokens[1]);

		tiles=new int[width][height];
		for(int y=0;y<height;y++) {
			for (int x=0;x<width;x++) {
				//System.out.print(tokens[(x+y)+4]);
				tiles[x][y]=Utils.parseInt(tokens[(x+y*width)+4]);
			}
		}
	}
}
