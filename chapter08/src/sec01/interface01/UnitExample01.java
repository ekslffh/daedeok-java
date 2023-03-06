package sec01.interface01;

public class UnitExample01 {

	public static void main(String[] args) {
		Fightable f = new Fight();
		
		if (f instanceof Unit) {
			System.out.println(f + "�� Unit class�� �ڽ� class");
		}
		
		if (f instanceof Fightable) {
			System.out.println(f + "�� Fightable �������̽��� ���� ����");
		}
		
		if (f instanceof Movable) {
			System.out.println(f + "�� Movable �������̽��� ���� ����");
		}
		
		if (f instanceof Attackable) {
			System.out.println(f + "�� Attackable �������̽��� ���� ����");
		}
		
	}
	
}
