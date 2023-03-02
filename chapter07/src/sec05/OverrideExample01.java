package sec05;

public class OverrideExample01 {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.infoPrint();
		
		Child c1 = new Child(57, "¿Ãº∫∞Ë");
		
		c1.infoPrint();
	}

}
