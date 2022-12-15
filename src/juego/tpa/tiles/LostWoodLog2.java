package juego.tpa.tiles;

import java.awt.Graphics;

import juego.tpa.gfx.Assets;

public class LostWoodLog2 extends Tile{
		public LostWoodLog2(int id) {
			super(Assets.lostWoodsLog2, id);
			renderOrder=3;
		}
		public void render(Graphics g, int x, int y){
			g.drawImage(texture, x, y, 72, 24, null);
		}
		public boolean isSolid(){
			return true;
		}
	}

