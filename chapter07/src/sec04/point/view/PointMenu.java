package sec04.point.view;

import java.util.Scanner;
import sec04.point.controller.CircleController;
import sec04.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원     => circleMenu()");
		System.out.println("2. 사각형  => rectangleMenu()");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");

		int menu = sc.nextInt();
		if (menu == 1) {
			this.circleMenu();
		} else if (menu == 2) {
			this.rectangleMenu();
		} else {
			System.out.println("종료합니다.");
			System.exit(0);
		}
	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레  => calcCircum()");
		System.out.println("2. 원 넓이  => calcCircleArea()");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 : ");

		int menu = sc.nextInt();
		if (menu == 1) {
			this.calcCircum();
		} else if (menu == 2) {
			this.calcCircleArea();
		} else if (menu == 9) {
			this.mainMenu();
		} else {
			this.circleMenu();
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레  => calcPerimeter()");
		System.out.println("2. 사각형 넓이  => calcRectArea()");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 : ");

		int menu = sc.nextInt();
		sc.nextLine();
		if (menu == 1) {
			this.calcPerimeter();
		} else if (menu == 2) {
			this.calcRectangleArea();
		} else if (menu == 9) {
			this.mainMenu();
		} else {
			this.rectangleMenu();
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		String result = cc.calcCircum(x, y, radius);
		System.out.println("둘레 : " + x + ", " + y + ", " + radius + " / " + result);
		this.mainMenu();
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		String result = cc.calcArea(x, y, radius);
		System.out.println("면적 : " + x + ", " + y + ", " + radius + " / " + result);
		this.mainMenu();
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		String result = rc.calcPerimeter(x, y, height, width);
		System.out.println("면적 : " + x + ", " + y + ", " + height + ", " + width + " / " + result);
		this.mainMenu();
	}

	public void calcRectangleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		String result = rc.calcArea(x, y, height, width);
		System.out.println("면적 : " + x + ", " + y + ", " + height + ", " + width + " / " + result);
		this.mainMenu();
	}

}
