//sample class shows how looks initialization order
public class Chick {
	
	private String name = "Kurczaczek";
	{ 
		System.out.println("name from instance initializer code block " + name);
		System.out.println("instance initializer now !");
	}
	
	public Chick() {
		name = "Pisklak";
		System.out.println("constructor initializer now !");
	}
	
	public static void main (String... args) {
		Chick chick = new Chick();
		System.out.println("chick name: " + chick.name);
	}
}
