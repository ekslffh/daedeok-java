package sec04.point.view;

import java.util.Scanner;
import sec04.point.controller.CircleController;
import sec04.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		System.out.println("===== �޴� =====");
		System.out.println("1. ��     => circleMenu()");
		System.out.println("2. �簢��  => rectangleMenu()");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");

		int menu = sc.nextInt();
		if (menu == 1) {
			this.circleMenu();
		} else if (menu == 2) {
			this.rectangleMenu();
		} else {
			System.out.println("�����մϴ�.");
			System.exit(0);
		}
	}

	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�  => calcCircum()");
		System.out.println("2. �� ����  => calcCircleArea()");
		System.out.println("3. ��������");
		System.out.print("�޴� ��ȣ : ");

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
		System.out.println("===== �޴� =====");
		System.out.println("1. �簢�� �ѷ�  => calcPerimeter()");
		System.out.println("2. �簢�� ����  => calcRectArea()");
		System.out.println("3. ��������");
		System.out.print("�޴� ��ȣ : ");

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
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		String result = cc.calcCircum(x, y, radius);
		System.out.println("�ѷ� : " + x + ", " + y + ", " + radius + " / " + result);
		this.mainMenu();
	}

	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		String result = cc.calcArea(x, y, radius);
		System.out.println("���� : " + x + ", " + y + ", " + radius + " / " + result);
		this.mainMenu();
	}

	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		String result = rc.calcPerimeter(x, y, height, width);
		System.out.println("���� : " + x + ", " + y + ", " + height + ", " + width + " / " + result);
		this.mainMenu();
	}

	public void calcRectangleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		String result = rc.calcArea(x, y, height, width);
		System.out.println("���� : " + x + ", " + y + ", " + height + ", " + width + " / " + result);
		this.mainMenu();
	}

}
