package sec02.exam01;

import java.util.Scanner;

public class ExamFloat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		
		final double PI = 3.1415926;
		
		double res = radius * radius * PI;
		
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + res);
		
	}

}
