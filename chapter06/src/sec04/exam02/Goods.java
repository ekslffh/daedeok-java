package sec04.exam02;

public class Goods {
	// ��ǰŬ�������� ��ǰ��ȣ�� ��ǰ������ �����Ǹ� ,��ǰ�� �Ű������� ����ϴ� �����ڰ� �����Ѵ�.
	// ����Ŭ�������� ��ǰŬ������ ������ų������ ��ǰ��ȣ�� �ڵ������� 1�� �����ǵ��� �����Ͻÿ�.

	private static long gid = 1000;
	private String gName;

	public Goods(String gName) {
		gid++;
		this.gName = gName; 
	}

	@Override
	public String toString() {
		return "��ǰ�ڵ� : " + gid + "\n��ǰ�� : " + gName;
	}

}
