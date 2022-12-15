package juego.tpa.states;

import java.awt.Graphics;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import juego.tpa.Game;
import juego.tpa.Handler;
import juego.tpa.Tick;
import juego.tpa.entities.creatures.Link;
import juego.tpa.entities.creatures.Links;
import juego.tpa.entities.creatures.Player;
import juego.tpa.worlds.Test;
import juego.tpa.worlds.World;
import juego.tpa.worlds.WorldList;
import juego.tpa.entities.creatures.DekuLink;
import juego.tpa.entities.creatures.GoronLink;

public class GameState extends State implements Tick{
	Links jugador=Links.Link;
	public GameState(Handler handler) {
		super(handler);
		handler.setWorld(WorldList.house5);
		
		
	}
	@Override
	public void tick() {
		if(handler.getKeyManager().esc) {
			State.setState(Game.getMenuState());
		}
		handler.getWorld().tick();
		player.tick();
	}
	@Override
	public void render(Graphics g) {
		handler.getWorld().render(g);
		player.render(g);
		handler.getWorld().renderFront(g);
	}

}
