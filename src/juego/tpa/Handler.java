 package juego.tpa;

import juego.tpa.entities.creatures.Player;
import juego.tpa.input.KeyManager;
import juego.tpa.input.MouseManager;
import juego.tpa.worlds.World;

public class Handler implements Singleton{
	private static Game game;
	private World world;
	private Player player;
	private static Handler instance;
	
public Handler(Game game) {
	this.game=game;
}
public static Handler getInstance(Game game) {
    if(instance == null) {
        instance = new Handler(game);
    }
    
    return instance;
 
}

public int getWidth() {
	return instance.game.getWidth();
}	
public int getHeight() {
	return instance.game.getHeight();
}
public Game getGame() {
	return instance.game;
}
public KeyManager getKeyManager() {
	return instance.game.getKeyManager();
}
public MouseManager getMouseManager() {
	return instance.game.getMouseManager();
}
public void setGame(Game game) {
	instance.game = game;
}
public World getWorld() {
	return instance.world;
}
public void setWorld(World world) {
	instance.world = world;
}
public Player getPlayer() {
	return instance.game.getGameState().getPlayer();
}

public void setPlayer(Player player) {
	instance.player = player;
}
@Override
public Object getInstance() {
	// TODO Auto-generated method stub
	return null;
}
}

