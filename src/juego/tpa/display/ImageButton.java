package juego.tpa.display;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.Handler;

public class ImageButton {
protected int x,y,height,width;
protected Handler handler;
protected BufferedImage image;

public ImageButton(int x, int y, int height, int width,BufferedImage image,Handler handler) {
	this.x = x;
	this.y = y;
	this.height = height;
	this.width = width;
	this.image=image;
	this.handler=handler;
}
public void render(Graphics g) {
	if(onMouse()) {
		g.drawImage(image,x-12,y-12,width+24,height+24,null);
	}
	else {
		g.drawImage(image,x,y,width,height,null);
	}
}
public boolean onMouse() {
	if(handler.getMouseManager().getMouseX()>x&&handler.getMouseManager().getMouseX()<x+width&&handler.getMouseManager().getMouseY()>y&&handler.getMouseManager().getMouseY()<y+height) {
		return true;
	}
	return false;
}
public boolean click() {
	return(onMouse()&&handler.getMouseManager().isLeftPressed());
}
}
