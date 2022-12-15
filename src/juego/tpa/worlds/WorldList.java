package juego.tpa.worlds;

import juego.tpa.Handler;

public class WorldList {
	public static World test,testTwo,pueblo,pueblo2,pueblo3,pueblo4,house1,house2,house3,house4,house5,house6;
	private static Handler handler;
	public WorldList(Handler handler) {
		setHandler(handler);
	}
public static void init(){
	test    = new Test(getHandler());
	testTwo = new TestTwo(getHandler());
	pueblo  = new Pueblo(getHandler());
	pueblo2 = new Pueblo2(getHandler());
	pueblo3 = new Pueblo3(getHandler());
	pueblo4 = new Pueblo4(getHandler());
	house1  = new House1(getHandler());
	house2  = new House2(getHandler());
	house3  = new House3(getHandler());
	house4  = new House4(getHandler());
	house5  = new House5(getHandler());
	house6  = new House6(getHandler());
}
public static Handler getHandler() {
	return handler;
}
public static void setHandler(Handler handler) {
	WorldList.handler = handler;
}
}
