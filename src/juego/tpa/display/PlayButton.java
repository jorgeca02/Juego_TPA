package juego.tpa.display;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Handler;

public class PlayButton extends ImageButton {
private BufferedImage baw;

public PlayButton (int x, int y, int height, int width,BufferedImage image,BufferedImage baw,Handler handler) {
super(x,y,height,width,image,handler);
this.baw=baw;
}
public void render(Graphics g) {
	if(handler.getGame().getGameState().getPlayer()!=null) {
		if(onMouse()) {
			g.drawImage(image,x-12,y-12,width+24,height+24,null);
		}
		else {
			g.drawImage(image,x,y,width,height,null);
		}	
	}
	else {
		if(onMouse()) {
			g.drawImage(baw,x-12,y-12,width+24,height+24,null);
		}
		else {
			g.drawImage(baw,x,y,width,height,null);
		}		
	}
	
}
}
