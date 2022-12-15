package juego.tpa.states;

import java.awt.Graphics;


import juego.tpa.Game;
import juego.tpa.Handler;
import juego.tpa.entities.creatures.Player;



public abstract class State {

	private static State currentState = null;
	protected Player player;
	protected Handler handler;
	public State(Handler handler) {
		this.handler=handler; 
	}
	public static void setState(State state) {
	    currentState = state;
	    
	    
	}
	public static State getState() {
		return currentState;
	}
	
public abstract void tick();
public abstract void render(Graphics g);
public Player getPlayer() {
	return player;
}
}
