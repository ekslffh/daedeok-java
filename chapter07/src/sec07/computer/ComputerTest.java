package sec07.computer;

public class ComputerTest {

	public static void main(String[] args) {
		
		DeskTop d1 = new DeskTop();
		d1.display();
		d1.typing();
		
		Computer c1 = new DeskTop();
		c1.display();
		c1.typing();
		
		Computer c2 = new MyNoteBook();
		c2.display();
		c2.typing();
		
	}

}
