package sec02.exam02;

public class ExampleTwoDim01 {

	public static void main(String[] args) {
		
		char[][] ch1 = new char[5][3];
		System.out.println("행의 수 = " + ch1.length);
		for (int i = 0; i < ch1.length; i++) {
			System.out.print("ch1[" + i + "] = " + ch1[i]);
			System.out.println(", 열의 갯수 = " + ch1[i].length);
		}
		
		char[][] ch2 = new char[3][];
		ch2[0] = new char[5];
		ch2[1] = new char[2];
		ch2[2] = new char[3];
		System.out.println("행의 수 = " + ch2.length);
		for (int i = 0; i < ch2.length; i++) {
			System.out.print("ch2[" + i + "] = " + ch2[i]);
			System.out.println(", 열의 갯수 = " + ch2[i].length);
		}
		
		char[][] ch3 = {{1, 2, 3}, {9, 8, 7}, {6, 7, 8}, {10, 11, 12}};
		System.out.println("행의 수 = " + ch3.length);
		for (int i = 0; i < ch3.length; i++) {
			System.out.print("ch3[" + i + "] = " + ch3[i]);
			System.out.println(", 열의 갯수 = " + ch3[i].length);
		}
		
		char[][] ch4 = {{1, 2, 3}, {9, 8, 7, 1, 2}, {6, 7}};
		System.out.println("행의 수 = " + ch4.length);
		for (int i = 0; i < ch4.length; i++) {
			System.out.print("ch4[" + i + "] = " + ch4[i]);
			System.out.println(", 열의 갯수 = " + ch4[i].length);
		}
		
	}

}
