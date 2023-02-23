package sec03.exam01;

import java.util.Scanner;

public class ExampleEnum02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		double d1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("두번째 수: ");
		double d2 = Double.parseDouble(sc.nextLine());
		
		System.out.printf("연산자 : ");
		String str = sc.nextLine();
				
		for(Operation op : Operation.values()) {
			if (op.toString().equals(str)) {
				System.out.printf("%f %s %f = %f%n", d1, op, d2, op.apply(d1, d2));
			}
		}
		
	}

}
