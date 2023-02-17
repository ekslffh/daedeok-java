package test;

class Car {
	public String name;
}

public class Var {
	
	public static void test(Car car) {
		car.name = "bb";
	}
	
	public static void main(String[] args) {

//		System.out.printf("hello, %s, %s", "java", "dd");
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		
		String a = "dd";
//		a.getClass().getName()
	} 
	
}
