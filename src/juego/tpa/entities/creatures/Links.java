package juego.tpa.entities.creatures;
public enum Links {
Link,Deku_Link,Goron_Link;
public String[] getItems() {
	String[] str = new String[Links.values().length];
	int i=0;
	for(Links comp: Links.values()) {
		str[i]=comp.toString();
		i++;
	}
	return str;
}
}
