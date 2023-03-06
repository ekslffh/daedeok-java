package sec01.interface01;

public interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable {
	void attack(Fightable f);
}

class Fight extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack(Fightable f) {}

	@Override
	public void attack(Unit u) {}
	
}

