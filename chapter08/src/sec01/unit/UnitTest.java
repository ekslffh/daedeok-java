package sec01.unit;

interface Repairable {} // ġ����� �� �ִ� ��ü ǥ��

class Unit {
	int hitPoint; // ȭ��: ����� ���� �پ���.
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "tank";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(50);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "marine";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(250);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "dropship";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(70);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++; // ��������
			}
			System.out.println(u.toString() + "�� ������ �����");
		}
	}
	
	@Override
	public String toString() {
		return "scv";
	}
}

public class UnitTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		
		SCV s = new SCV();
		s.repair(tank);
		s.repair(d);
		
//		s.repair(m);
	}
	
}
