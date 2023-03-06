package sec01.interface01;

public class UnitExample01 {

	public static void main(String[] args) {
		Fightable f = new Fight();
		
		if (f instanceof Unit) {
			System.out.println(f + "는 Unit class의 자식 class");
		}
		
		if (f instanceof Fightable) {
			System.out.println(f + "는 Fightable 인터페이스를 구현 했음");
		}
		
		if (f instanceof Movable) {
			System.out.println(f + "는 Movable 인터페이스를 구현 했음");
		}
		
		if (f instanceof Attackable) {
			System.out.println(f + "는 Attackable 인터페이스를 구현 했음");
		}
		
	}
	
}
