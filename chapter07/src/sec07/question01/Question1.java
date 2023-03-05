package sec07.question01;

/*여러 가지 도형 객체를 구현해야 하고, 넓이나 부피, 중심 좌표 등을 제공해줄 수 있게 해야한다.
 *즉, "원", "사각형", "삼각형" 등의 클래스는 추상화하여 "평면도형"이라는 부모 클래스 정의하고 상속받게 하며 
 *"구", "직육면체", "삼각뿔" 등의 클래스는 "입체도형"이라는 부모 클래스로 정의하고 상속받게 하라. 
 *입체도형과 평면도형 클래스는 다시 추상화하여 "도형"이라는 부모 클래스를 정의하고 상속 받게 설계하면 
 *또 평면도형과 입체도형은 "도형"객체를 상속 받게하면, 도형->평면도형->원 과 같은 형태가 된다 
 *넓이()나 부피() 같은 메소드는 최종 자식 클래스에서 구체적으로 구현해줄 수 있지만 평면도형, 
 *입체도형 클래스 시점에선 이를 구현하지 않고 추상 메소드로 선언해두고 자식 클래스에서 실제로 구현한다  
 *또 평면도형 클래스에선 무게중심의 좌표를, 입체도형 클래스에선 질량중심의 좌표 정의할 것이디. 
 */

// 도형 클래스 : 좌표(x,y), 출력메서드(추상)
// 평면도형 클래스 : PlaneFigure
// 입체도형 클래스 : SolidFigure
// 넓이를 구하는 메서드 : getArea
// 부피를 구하는 메서드 : getVolume
// 구 클래스 : Sphere
// 직육면체 : Rectangular
// 원뿔 클래스 : Cone

// 원 : Circle
// 삼각형 : Triangle
// 사각형 : Rectangle
public class Question1 {
	public static void main(String[] args) {
		Circle circle = new Circle(0, 0, 5);
		circle.getArea();
		
		Rectangle rectangle = new Rectangle(0, 0, 5, 8);
		rectangle.getArea();
		
		Triangle triangle = new Triangle(0, 0, 5, 8);
		triangle.getArea();
		
		Sphere sphere = new Sphere(0, 0, 0, 3);
		sphere.getVolume();
		
		Rectangular rectangular = new Rectangular(0, 0, 0, 4, 5, 3);
		rectangular.getVolume();
		
		Cone cone = new Cone(0, 0, 0, 5, 7);
		cone.getVolume();
	}
}
