package juego.tpa.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage[] dekuDown,dekuUp,dekuLeft,dekuRight,goronDown,goronUp,goronLeft,goronRight,korok5Down,korok5Up,korok5Left,korok5Right,korok6Down,korok6Up,korok6Left,
	korok6Right,linkDown,linkUp,linkLeft,linkRight,musician,easterEgg;
	public static BufferedImage standingLink,standingDeku,grass1,tree1,
	                            defaultGrass,plant1,sand1,lostWoodsLog1,
	                            lostWoodsLog2,lostWoodsLogCenter,grass2,
	                            standingGoron,tree2,treeFront1,treeFront2,
	                            roadU,roadL,roadR,roadC,roadD,roadI1,
	                            roadI2,roadI3,roadI4,roadO1,roadO2,roadO3,
	                            roadO4,roadExtra1,roadExtra2,roadExtra3,
	                            roadExtra4,yellowTree,house1,house2,
	                            roadExtra5,roadExtra6,black,floor,wallU,
	                            wallD,wallL,wallL2,wallR,wallC1,wallC2,
	                            wallC3,wallC4,door,window,bush1,bush2,
	                            bush3,bed1,bed2,deco1,deco2,deco3,deco4,deco5,deco6,
	                            pared1,pared2,plaza,pajaro, water1,water2,
	                            water3,water4,water5,water6,water7,water8,
	                            water9,path,standingKorok1,standingKorok2,
	                            standingKorok3,standingKorok4,table1,table2,deco7,
	                            floor2,floor3,floor4,floor5,floor6,floor7,floor8,
	                            library,library2,sittingLady;
	                    

	public static void init(){
		plaza=(ImageLoader.loadImage("/textures/Plaza.png"));
		SpriteSheet link          = new SpriteSheet(ImageLoader.loadImage("/textures/Link.png")),
				    deku          = new SpriteSheet(ImageLoader.loadImage("/textures/DekuLink.gif")),
				    goron         = new SpriteSheet(ImageLoader.loadImage("/textures/GoronLink.png")), 
				    lostWoodsTile = new SpriteSheet(ImageLoader.loadImage("/textures/LostWoods.png")),
		            overworldTile = new SpriteSheet(ImageLoader.loadImage("/textures/Overworld.png")),
		            kakarikoTile  = new SpriteSheet(ImageLoader.loadImage("/textures/Kakarico.png")),
		            houseExTile   = new SpriteSheet(ImageLoader.loadImage("/textures/House_Exterior.png")),
		            houseInTile   = new SpriteSheet(ImageLoader.loadImage("/textures/House_Interior.png")),
		            NPC       = new SpriteSheet(ImageLoader.loadImage("/textures/NPC.png"));
		            		
		dekuDown= new BufferedImage[4];
		dekuDown[0]=deku.crop(27,2,12,19);
		dekuDown[1]=deku.crop(46,2,12,19);
		dekuDown[2]=deku.crop(66,2,12,19);
		dekuDown[3]=deku.crop(85,2,12,19);
		
		dekuUp= new BufferedImage[4];
		dekuUp[0]=deku.crop(27,23,12,20);
		dekuUp[1]=deku.crop(46,23,12,20);
		dekuUp[2]=deku.crop(66,23,12,20);
		dekuUp[3]=deku.crop(85,23,12,20);
		
		dekuLeft= new BufferedImage[4];
		dekuLeft[0]=deku.crop(24,45,18,19);
		dekuLeft[1]=deku.crop(44,45,18,19);
		dekuLeft[2]=deku.crop(63,45,18,19);
		dekuLeft[3]=deku.crop(83,45,18,19);
		
        dekuRight= new BufferedImage[4];
		dekuRight[0]=deku.crop(23,68,18,19);
		dekuRight[1]=deku.crop(43,68,18,19);
		dekuRight[2]=deku.crop(62,68,18,19);
		dekuRight[3]=deku.crop(82,68,18,19);
		
		goronDown= new BufferedImage[4];
		goronDown[0]=goron.crop(53,50,26,30);
		goronDown[1]=goron.crop(109,50,26,30);
		goronDown[2]=goron.crop(165,50,26,30);
		goronDown[3]=goron.crop(221,50,26,30);
		
		goronUp= new BufferedImage[4];
		goronUp[0]=goron.crop(46,88,26,32);
		goronUp[1]=goron.crop(106,88,26,32);
		goronUp[2]=goron.crop(169,88,26,32);
		goronUp[3]=goron.crop(229,88,26,32);
		
		goronLeft= new BufferedImage[4];
		goronLeft[0]=goron.crop(56,129,23,30);
		goronLeft[1]=goron.crop(104,129,23,30);
		goronLeft[2]=goron.crop(152,129,23,30);
		goronLeft[3]=goron.crop(200,129,23,30);
		
		goronRight= new BufferedImage[4];
        goronRight[0]=goron.crop(54,169,23,30);
		goronRight[1]=goron.crop(102,169,23,30);
		goronRight[2]=goron.crop(150,169,23,30);
		goronRight[3]=goron.crop(198,169,23,30);
		
		linkDown= new BufferedImage[4];
		linkDown[0]=link.crop(121,2,16,23);
		linkDown[1]=link.crop(104,2,16,23);
		linkDown[2]=link.crop(53,2,16,23);
		linkDown[3]=link.crop(88,2,16,23);
		
		linkUp= new BufferedImage[4];
		linkUp[0]=link.crop(173,112,16,23);
		linkUp[1]=link.crop(190,112,16,23);
		linkUp[2]=link.crop(224,112,16,23);
		linkUp[3]=link.crop(241,112,16,23);
		
		linkLeft= new BufferedImage[4];
		linkLeft[0]=link.crop(75,85,16,23);
		linkLeft[1]=link.crop(199,85,16,23);
		linkLeft[2]=link.crop(146,85,16,23);
		linkLeft[3]=link.crop(128,85,16,23);
		
		linkRight= new BufferedImage[4];
		linkRight[0]=link.crop(73,58,16,23);
		linkRight[1]=link.crop(91,58,16,23);
		linkRight[2]=link.crop(144,58,16,23);
		linkRight[3]=link.crop(20,58,16,23);
		
		korok5Down= new BufferedImage[3];
		korok5Down[0]=NPC.crop(15,14,19,29);
		korok5Down[1]=NPC.crop(36,14,19,29);
		korok5Down[2]=NPC.crop(57,14,19,29);
		
		korok5Up= new BufferedImage[3];
		korok5Up[0]=NPC.crop(85,14,19,29);
		korok5Up[1]=NPC.crop(106,14,19,29);
		korok5Up[2]=NPC.crop(127,14,19,29);
		
		korok5Left= new BufferedImage[3];
		korok5Left[0]=NPC.crop(15,350,19,29);
		korok5Left[1]=NPC.crop(36,350,19,29);
		korok5Left[2]=NPC.crop(57,350,19,29);

		korok5Right= new BufferedImage[3];
		korok5Right[0]=NPC.crop(85,350,19,29);
		korok5Right[1]=NPC.crop(106,350,19,29);
		korok5Right[2]=NPC.crop(127,350,19,29);
		
		korok6Down= new BufferedImage[3];
		korok6Down[0]=NPC.crop(15,113,19,29);
		korok6Down[1]=NPC.crop(36,113,19,29);
		korok6Down[2]=NPC.crop(57,113,19,29);
		
		korok6Up= new BufferedImage[3];
		korok6Up[0]=NPC.crop(85,113,19,29);
		korok6Up[1]=NPC.crop(106,113,19,29);
		korok6Up[2]=NPC.crop(127,113,19,29);
		
		korok6Left= new BufferedImage[3];
		korok6Left[0]=NPC.crop(15,449,19,29);
		korok6Left[1]=NPC.crop(36,449,19,29);
		korok6Left[2]=NPC.crop(57,449,19,29);

		korok6Right= new BufferedImage[3];
		korok6Right[0]=NPC.crop(85,449,19,29);
		korok6Right[1]=NPC.crop(106,449,19,29);
		korok6Right[2]=NPC.crop(127,449,19,29);
		
		musician= new BufferedImage[4];
		musician[0]=NPC.crop(161,54,17,24);
		musician[1]=NPC.crop(181,54,17,24);
		musician[2]=NPC.crop(200,53,17,24);
		musician[3]=NPC.crop(220,53,17,24);
		
		standingLink       =link.crop(1,3, 16, 23);
		standingDeku       =deku.crop(4,3,12,18);
		standingGoron      =goron.crop(123,15,26,30);
        standingKorok1     = NPC.crop(36,80,19,29);
        standingKorok2     = NPC.crop(106,146,19,29);
        standingKorok3     = NPC.crop(106,647,19,29);
        standingKorok4     = NPC.crop(36,548,19,29);
		
		grass1             = overworldTile.crop(253, 57, 16, 16);
		defaultGrass       = overworldTile.crop(253,22,16,16);
		grass2             = lostWoodsTile.crop(336, 41, 16, 16);
		
		tree1              = overworldTile.crop(230, 209, 64, 80);
		tree2              = overworldTile.crop(228, 390, 64, 80);
		treeFront1         = overworldTile.crop(230, 209, 64, 32);
		treeFront2         = overworldTile.crop(230, 241, 64, 48);
		yellowTree         = kakarikoTile.crop(123, 94, 16, 24);
		
		plant1             = overworldTile.crop(304, 57, 16, 16);
		
		lostWoodsLog1      = lostWoodsTile.crop(211, 77, 48,16);
		lostWoodsLog2      = lostWoodsTile.crop(211, 60, 48,16);
		lostWoodsLogCenter = lostWoodsTile.crop(16, 71, 48,48);
		
		roadU              = kakarikoTile.crop(26, 84, 16,16);
		roadD              = kakarikoTile.crop(26,100,16,16);
		roadL              = kakarikoTile.crop(18,92,16,16);
		roadR              = kakarikoTile.crop(34,92,16,16);
		roadC              = kakarikoTile.crop(26,92,16,16);
		roadI1             = kakarikoTile.crop(18,84,16,16);
		roadI2             = kakarikoTile.crop(34,84,16,16);
		roadI3             = kakarikoTile.crop(18,100,16,16);
		roadI4             = kakarikoTile.crop(34,100,16,16);
		roadO1             = kakarikoTile.crop(36,168,16,16);
		roadO2             = kakarikoTile.crop(52,168,16,16);
		roadO3             = kakarikoTile.crop(36,183,16,16);
		
		roadExtra1         = kakarikoTile.crop(89,191,16,16);
		roadExtra2         = kakarikoTile.crop(105,191,16,16);
		roadExtra3         = kakarikoTile.crop(89,207,16,16);
		roadExtra4         = kakarikoTile.crop(105,207,16,16);
		roadExtra6         = kakarikoTile.crop(341,4,16,16);
		roadExtra5         = kakarikoTile.crop(349,4,16,16);
		
		house1             = houseExTile.crop(202, 117, 64, 72);
		house2             = houseExTile.crop(16,351, 128,72);
		
		black              = houseInTile.crop(155,187, 16,16);
		floor              = houseInTile.crop(137 ,187, 16,16);
		floor2             = houseInTile.crop(33 ,291, 16,16);
		floor3             = houseInTile.crop(50 ,274, 16,16);
		floor4             = houseInTile.crop(50 ,291, 16,16);
		floor5             = houseInTile.crop(68 ,274, 16,16);
		floor6             = houseInTile.crop(68 ,291, 16,16);
		floor7             = houseInTile.crop(85 ,291, 16,16);
		floor8             = houseInTile.crop(33 ,274, 16,16);
		
		wallU              = houseInTile.crop(34, 95, 16,24);
		wallD              = houseInTile.crop(34,135, 16,24);
		wallL              = houseInTile.crop(2,119,  16,16);
		wallL2             = houseInTile.crop(18,119, 16,16);
		wallR              = houseInTile.crop(50,119, 24,16);
		
		wallC1             = houseInTile.crop(190,228, 32,24);
		wallC2             = houseInTile.crop(223,228, 32,32);
		wallC3             = houseInTile.crop(190,262, 32,32);
		wallC4             = houseInTile.crop(223,262, 32,32);
		
		door               = houseInTile.crop(201,195, 32,32);
		window             = houseInTile.crop(109,140, 32,32);
		
		bush1              = kakarikoTile.crop(257, 56, 16, 32);
		bush2              = kakarikoTile.crop(265, 56, 16, 32);
		bush3              = kakarikoTile.crop(273, 56, 16, 32);
		
		bed1               = houseInTile.crop(13,34, 32,15);
		bed2               = houseInTile.crop(13,40, 32,16);
		
		deco1              = houseInTile.crop(55,35,16,16);
		deco2              = houseInTile.crop(88,35,16,16);
		deco3              = houseInTile.crop(71,35,16,16);
		deco4              = houseInTile.crop(365,27,32,40);
		deco5              = houseInTile.crop(400,27,32,40);
		deco6              = houseInTile.crop(82,230,32,16);
		deco7              = houseInTile.crop(336,45,16,16);
		
		table1             = houseInTile.crop(265,240,48,32);
		table2             = houseInTile.crop(265,273,32,24);
		
		library            = houseInTile.crop(357, 147, 80, 98);
		library2           = houseInTile.crop(357, 243, 80, 16);
		
		pajaro             = kakarikoTile.crop(309,120,40,32);
		
		water1             = overworldTile.crop(30, 255, 16, 16);
        water2             = overworldTile.crop(50, 255, 16, 16);
        water3             = overworldTile.crop(70, 255, 16, 16);
        water4             = overworldTile.crop(30, 274, 16, 16);
        water5             = overworldTile.crop(50, 274, 16, 16);
        water6             = overworldTile.crop(70,274, 16, 16);
        water7             = overworldTile.crop(30, 294, 16, 16);
        water8             = overworldTile.crop(50, 294, 16, 16);
        water9             = overworldTile.crop(70, 294, 16, 16);
        
        path               = kakarikoTile.crop(332,77,16,16);
        sittingLady        = NPC.crop(351, 8, 17, 32);

        
        easterEgg= new BufferedImage[6];
        easterEgg[0]=(ImageLoader.loadImage("/textures/easter_egg/00.jpg"));
        easterEgg[1]=(ImageLoader.loadImage("/textures/easter_egg/01.jpg"));
        easterEgg[2]=(ImageLoader.loadImage("/textures/easter_egg/02.jpg"));
        easterEgg[3]=(ImageLoader.loadImage("/textures/easter_egg/03.jpg"));
        easterEgg[4]=(ImageLoader.loadImage("/textures/easter_egg/04.jpg"));
        easterEgg[5]=(ImageLoader.loadImage("/textures/easter_egg/05.jpg"));
	}
}
