package sec06.exam01;

public class TempString {

	public static void main(String[] args) {

		String str = "ȫ�浿";
		System.out.println(str);
		
		Temp t1 = new Temp();
		System.out.println(t1);
		
	}

}
class Temp{
	@Override
	public String toString() {
		return "myMethod";
	}
}
