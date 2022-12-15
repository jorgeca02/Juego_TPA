package juego.tpa;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import juego.tpa.display.Display;
import juego.tpa.gfx.Assets;
import juego.tpa.input.KeyManager;
import juego.tpa.input.MouseManager;
import juego.tpa.states.CharacterState;
import juego.tpa.states.GameState;
import juego.tpa.states.MenuState;
import juego.tpa.states.State;
import juego.tpa.worlds.WorldList;
public class Game implements Runnable{
private Display display;
private int width,height;
public String title;
public static int ticks;

private boolean running=false;
private Thread thread;

private BufferStrategy bs;
private Graphics g;

private  static State gameState;
private	 static State menuState;
private	 static State characterState;

private KeyManager keyManager;
private MouseManager mouseManager;
private Handler handler;

public Game (String title, int width, int height) 
{
	this.width=width;
	this.height=height;
	this.title=title;
	keyManager=new KeyManager();
	mouseManager=new MouseManager();
	ticks=0;
}

private void init() {
	setDisplay(new Display(title,width,height));
	getDisplay().getFrame().addKeyListener(keyManager);
	getDisplay().getFrame().addMouseListener(mouseManager);
	getDisplay().getFrame().addMouseMotionListener(mouseManager);
	getDisplay().getCanvas().addMouseListener(mouseManager);
	getDisplay().getCanvas().addMouseMotionListener(mouseManager);
	Assets.init();
	
	
	
	handler= Handler.getInstance(this);
	WorldList.setHandler(handler);
	WorldList.init();

	
	gameState=new GameState(handler);
	menuState= new MenuState(handler);
	characterState= new CharacterState(handler);
	
	State.setState(menuState);
}



private void tick() {
		keyManager.tick();
	if(State.getState()!=null) {
		State.getState().tick();
	}

	
}
private void render() {
	bs = getDisplay().getCanvas().getBufferStrategy();
	if(bs == null) {
		getDisplay().getCanvas().createBufferStrategy(3);
		return;
	}
	g = bs.getDrawGraphics();
	//vaciar pantalla
	g.clearRect(0, 0, width,height);
	//Dibujando
	
	if(State.getState()!=null) {
		State.getState().render(g);
	}
	
	//Acaba dibujo
	bs.show();
	g.dispose();
}

public void run() {
	init();
	
	int fps = 60;
	double timePerTick = 1000000000 / fps;
	double delta = 0;
	long now;
	long lastTime = System.nanoTime();
	long timer = 0;
	
	
	while(running) {
		now = System.nanoTime();
		delta += (now - lastTime) / timePerTick;
		timer += now - lastTime;
		lastTime = now;
		
		if(delta >= 1){
			tick();
			render();
			ticks++;
			delta--;
		}
		
		if(timer >= 1000000000){
			System.out.println("FPS: " + ticks);
			ticks = 0;
			timer = 0;
		}
	}
	
	stop();
	
}

public KeyManager getKeyManager() {
	return keyManager;
}
public synchronized void start() {
	if(running)
		return;
	running=true;
	thread = new Thread(this);
	thread.start();
}
public synchronized void stop() {
	if(!running)
		return;
	running=false;
	try {
		thread.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}

public Display getDisplay() {
	return display;
}

public void setDisplay(Display display) {
	this.display = display;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public State getGameState() {
	return gameState;
}
public static State getMenuState() {
	return menuState;
}
public MouseManager getMouseManager() {
	return mouseManager;
}
public State getCharacterState() {
	return characterState;
}

public void setCharacterState(State characterState) {
	this.characterState = characterState;
}
}