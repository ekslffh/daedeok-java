package sec01.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 2개 입력");
			System.out.print("정수 1 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.print("정수 2 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			int res = num1 / num2;
//		} catch (Exception e) {
//			System.out.println("연산오류 발생");
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("연산오류 발생");
//			e.printStackTrace();
//		} catch (InputMismatchException e) {
//			System.out.println("연산오류 발생");
//			e.printStackTrace();
		} finally {
			System.out.println("이곳은 반드시 수행되는 곳입니다");
		}
		
	}

}
