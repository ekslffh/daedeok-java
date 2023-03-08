package lang.object;

public class ExampleString {

	public static void main(String[] args) {
		// String Ŭ������ ���뺯���� ������ ����
		// charAt(int idx) - idx��ġ�� ����(char) ��ȯ
		// compareTo(String str) - str�� ���� ��(������ ��)
		// indexOf(char ch | String str) - �ش� ���ڳ� ������ ���� ��ġ ��ȯ
		// toCharArray() - �ش� ���ڿ��� ���ڹ迭�� ��ȯ (char�迭)
		// substring(int sidx, int eidx)
		// - �־��� ���ڿ����� sidx���� eidx - 1��° ���ڿ��� ���ο� ���ڿ��� ����� ��ȯ
		// trim() - �¿쿡 �����ϴ� ��ȿ�� ���� ����
		String str1 = "������ �߱� ���� 846";
		String str2 = "Hello";
		
		System.out.println(str1.charAt(5));
		System.out.println(str2.compareTo("Hello"));
		System.out.println("Hello John");
		System.out.println(str2.compareTo("Hello!"));
		
		System.out.println("hello �ּ� " + System.identityHashCode("Hello"));
		System.out.println("hello john �ּ� " + System.identityHashCode("Hello" + "John"));

		System.out.println(str1.indexOf('��'));
		System.out.println(str1.indexOf("���"));
		
		char[] addr = str1.toCharArray();
		for (char c : addr) {
			System.out.println(c);
		}
	}
	
}
