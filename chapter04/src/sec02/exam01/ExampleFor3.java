package sec02.exam01;

public class ExampleFor3 {

	public static void main(String[] args) {
		
		// for문을 이용하여
		//	1 2 3 4 5
		// 	6 7 8 9 10
		// 11 12 13 14 15를 인쇄하는 for문을 작성
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((i * 5 + j) + " ");
			}
			System.out.println();
		}
		
		//	*		****		*		*******
		// 	**		 ***	   ***		 *****
		// 	***		  **	  *****		  ***
		// 	****	   *	 *******	   *	를 인쇄하는 for문 작성
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 4; i > 0; i--) {
//			for (int j = 0; j < (4 - i); j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < (3 - i); j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < (i * 2 + 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 3; i >= 0; i--) {
//			for (int j = 0; j < (4 - i - 1); j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < (i * 2 + 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((3 - i) * 2 + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
