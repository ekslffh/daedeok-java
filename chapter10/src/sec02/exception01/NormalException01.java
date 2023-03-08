package sec02.exception01;

public class NormalException01 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//		try {
//			testException();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값이 부족합니다");
//		}
		testException();
	}
	
	public static void testException() throws ArrayIndexOutOfBoundsException {
		String data1 = null;
		String data2 = "";
		String[] args = new String[3];
			System.out.println("args[2]=" + args[2]);
			System.out.println("args[3]=" + args[3]);
	}
	
}
