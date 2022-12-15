package juego.tpa.entities.creatures;

import juego.tpa.Handler;

public abstract class Player extends Creature {

	private Handler handler;
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.handler=handler;
	}
	public void tick() {
		getInput();
		move();
		animTick();
	}

private void getInput() {
	xMove=0;
	yMove=0;
	if(handler.getKeyManager().up) {
		yMove=-speed;
	}
	if(handler.getKeyManager().down) {
		yMove=speed;
	}
	if(handler.getKeyManager().left) {
		xMove=-speed;
	}
	if(handler.getKeyManager().right) {
		xMove=+speed;
	}
}
}

