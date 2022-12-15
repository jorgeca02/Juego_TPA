package juego.tpa.entities;

import java.awt.Graphics;

import juego.tpa.entities.creatures.Creature;

public class EntityManager {
private Entity[] entities;
private int i=0;
public EntityManager(int n){
	entities=new Entity[n];
}
public void add(Creature c) {
if(i<entities.length) {
	entities[i]=c;
	i++;
}


}
public void render(Graphics g) {
	for(int e=0;e<entities.length;e++) {
		entities[e].render(g);
}
}
public void tick() {
	for(int e=0;e<entities.length;e++) {
		entities[e].tick();
}
	
}
}
