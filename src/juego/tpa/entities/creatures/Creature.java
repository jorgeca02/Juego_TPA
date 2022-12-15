package juego.tpa.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Handler;
import juego.tpa.entities.Entity;
import juego.tpa.gfx.Animation;
import juego.tpa.tiles.Tile;

public abstract class Creature extends Entity {
    public static final int DEFAULT_HEALTH=10;
    public static final float DEFAULT_SPEED=5;
    public static final int DEFAULT_CREATURE_WIDTH=24,
    		                DEFAULT_CREATURE_HEIGHT=36;
	protected int health;
	protected float speed;
	protected float xMove,yMove;
	
	protected Animation walkDown,walkUp,walkLeft,walkRight;
	protected BufferedImage lastFrame;
	
	public Creature(Handler handler,float x, float y, int width, int height) {
		super(handler,x, y, width,height);
		health=DEFAULT_HEALTH;
		speed=DEFAULT_SPEED;
		xMove=0;
		yMove=0;
	}

	public void move() {
		moveX();
		moveY();
	}
	public void moveX() {
		if(xMove>0) {
			int tx = (int) (x+xMove+bounds.x+bounds.width)/Tile.TILEWIDTH;
			if(!collisionWithTile(tx,(int)(y+bounds.y)/Tile.TILEHEIGHT)&&!collisionWithTile(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT))
				x+= xMove;
		}else if(xMove<0) {
			int tx = (int) (x+xMove+bounds.x)/Tile.TILEWIDTH;
			if(!collisionWithTile(tx,(int)(y+bounds.y)/Tile.TILEHEIGHT)&&!collisionWithTile(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT))
				x+= xMove;
		}
	}
	public void moveY(){
		if(yMove < 0){
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;
			
			if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
					!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty) ){
				y += yMove;
			}
		}else if(yMove > 0){
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;
			
			if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
					!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)&& handler.getPlayer().getY()<24*29){
				y += yMove;
			}
		}
	}
	public void animTick(){
		walkDown.tick();
		walkUp.tick();
		walkLeft.tick();
		walkRight.tick();
	}
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int)x,(int)y,width,height,null);
	}
	protected BufferedImage getCurrentAnimationFrame(){
		if(yMove > 0){
			lastFrame = walkDown.getFrame(2);
			return walkDown.getCurrentFrame();
		}else if(yMove < 0){
			lastFrame = walkUp.getFrame(2);
			return walkUp.getCurrentFrame();
		}else if (xMove < 0){
			lastFrame = walkLeft.getFrame(2);
			return walkLeft.getCurrentFrame();
		}else if(xMove > 0){
			    lastFrame = walkRight.getFrame(0);
				return walkRight.getCurrentFrame();
		}else {
			return lastFrame;
		}
	}
	protected boolean collisionWithTile(int x, int y) {
		if(handler.getWorld()!=null)
		return handler.getWorld().getTile(x, y).isSolid();
		else return false;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getxMove() {
		return xMove;
	}
	public void setxMove(float xMove) {
		this.xMove = xMove;
	}
	public float getyMove() {
		return yMove;
	}
	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

}
