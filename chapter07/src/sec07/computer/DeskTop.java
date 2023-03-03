package sec07.computer;

public class DeskTop extends Computer {

	@Override
	protected void display() {
		System.out.println("32인치 모니터 사용");
	}

	@Override
	protected void typing() {
		System.out.println("apple magic 키보드 사용");
	}	

}
