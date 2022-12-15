package juego.tpa.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import juego.tpa.gfx.Assets;

public class Tile {
	
	public static Tile[] tiles = new Tile[256];
	public static NotSolidTile grass1             = new NotSolidTile(0,Assets.grass1);
	public static NotSolidTile defaultGrass       = new NotSolidTile(1,Assets.defaultGrass);
	public static NotSolidTile plant1             =new NotSolidTile(2,Assets.plant1);
	public static Tree1 tree1                     = new Tree1(3,false);
	public static LostWoodLog1 lostWoodLog1= new LostWoodLog1(4);
	public static LostWoodLog2 lostWoodLog2= new LostWoodLog2(5);
	public static LostWoodLogCenter lostWoodLogCenter= new LostWoodLogCenter(6);
	public static NotSolidTile grass2= new NotSolidTile(7,Assets.grass2);
	public static Tree2 tree2= new Tree2(8);
	public static TreeFront treeFront= new TreeFront(9);
	public static TreeFront2 treeFront2= new TreeFront2(10);
	public static DefaultSolidGrass solidGrass = new DefaultSolidGrass(11);
	public static NotSolidTile roadU  = new NotSolidTile(12,Assets.roadU);
	public static NotSolidTile roadD  = new NotSolidTile(13,Assets.roadD);
	public static NotSolidTile roadR  = new NotSolidTile(14,Assets.roadR);
	public static NotSolidTile roadL  = new NotSolidTile(15,Assets.roadL);
	public static NotSolidTile roadI1 = new NotSolidTile(16,Assets.roadI1);
	public static NotSolidTile roadI2 = new NotSolidTile(17,Assets.roadI2);
	public static NotSolidTile roadI3 = new NotSolidTile(18,Assets.roadI3);
	public static NotSolidTile roadI4 = new NotSolidTile(19,Assets.roadI4);
	public static NotSolidTile roadO1 = new NotSolidTile(51,Assets.roadO1);
	public static NotSolidTile roadO2 = new NotSolidTile(52,Assets.roadO2);
	public static NotSolidTile roadO3 = new NotSolidTile(20,Assets.roadO3);
	public static YellowTree yellowTree = new YellowTree (21);
	public static NotSolidTile roadC  = new NotSolidTile(22,Assets.roadC);
	public static NotSolidTile roadE1 = new NotSolidTile(23,Assets.roadExtra1,2);
	public static NotSolidTile roadE2 = new NotSolidTile(24,Assets.roadExtra2,2);
	public static NotSolidTile roadE3 = new NotSolidTile(25,Assets.roadExtra3,2);
	public static NotSolidTile roadE4 = new NotSolidTile(26,Assets.roadExtra4,2);
	public static House1 house1       = new House1(27);
	public static NotSolidTile roadE5  = new NotSolidTile(28,Assets.roadExtra5,2);
	public static NotSolidTile roadE6  = new NotSolidTile(29,Assets.roadExtra6,2);
	public static House2 house2        = new House2(30);
	public static SolidTile  black     = new SolidTile(31,Assets.black);
	public static NotSolidTile  floor  = new NotSolidTile(32,Assets.floor);
	public static WallU wallU      = new WallU(33);
	public static WallD wallD      = new WallD(34);
	public static WallR wallR      = new WallR(35);
	public static WallL wallL      = new WallL(36);
	public static WallL2 wallL2    = new WallL2(37);
	public static WallC1 wallC1    = new WallC1(38);
	public static WallC2 wallC2    = new WallC2(39);
	public static WallC3 wallC3    = new WallC3(40);
	public static WallC4 wallC4    = new WallC4(41);
	public static Door door        = new Door(42);
	public static Window window    = new Window(43);
	public static Bush1 bush1      = new Bush1(44);
	public static Bush2 bush2      = new Bush2(45);
	public static Bush3 bush3      = new Bush3(46);
	public static Bed1 bed1        = new Bed1(47);
	public static Bed2 bed2        = new Bed2(48);
	public static SolidTile deco1  = new SolidTile(49,Assets.deco1,2);
	public static SolidTile deco2  = new SolidTile(50,Assets.deco3);
	public static Plaza  plaza     = new Plaza(53);
	public static Pajaro pajaro    = new Pajaro(54);
	public static SolidTile water1 = new SolidTile(55,Assets.water1);
	public static SolidTile water2 = new SolidTile(56,Assets.water2);
	public static SolidTile water3 = new SolidTile(57,Assets.water3);
	public static SolidTile water4 = new SolidTile(58,Assets.water4);
	public static SolidTile water5 = new SolidTile(59,Assets.water5);
	public static SolidTile water6 = new SolidTile(60,Assets.water6);
	public static SolidTile water7 = new SolidTile(61,Assets.water7);
	public static SolidTile water8 = new SolidTile(62,Assets.water8);
	public static SolidTile water9 = new SolidTile(63,Assets.water9);
	public static NotSolidTile path    = new NotSolidTile(64,Assets.path);
	public static SolidTile deco3      = new SolidTile(65,Assets.deco3);
	public static Deco4 deco4          = new Deco4(66);
	public static Deco5 deco5          = new Deco5(67);
	public static Table1 table1        = new Table1(68);
	public static NotSolidTile deco7   = new NotSolidTile(69,Assets.deco7);
	public static Table2 table2        = new Table2(70);
	public static NotSolidTile floor2  = new NotSolidTile(71,Assets.floor2);
	public static SolidTile    floor3  = new SolidTile   (72,Assets.floor4);
	public static NotSolidTile floor4  = new NotSolidTile(73,Assets.floor4);
	public static NotSolidTile floor5  = new NotSolidTile(74,Assets.floor5);
	public static NotSolidTile floor6  = new NotSolidTile(75,Assets.floor6);
	public static NotSolidTile floor7  = new NotSolidTile(76,Assets.floor7);
	public static NotSolidTile floor8  = new NotSolidTile(77,Assets.floor8);
	public static Library library      = new Library(78);
	public static Library2 library2    = new Library2(79);
	
	public static final int TILEWIDTH = 24, TILEHEIGHT = 24;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public boolean front=false;
	public int renderOrder=1;
	
	public int getId(){
		return id;
	}
	
}
