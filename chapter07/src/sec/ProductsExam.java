package sec;

public class ProductsExam {

	public static void main(String[] args) {

		Tv tv1 = new Tv("LED TV", 1000, 10, true, 70);
		System.out.println(tv1);
		System.out.println();
		
		Computer computer1 = new Computer("slim pentinum", 1500000, 50, "intel i7-10700", 16);
		System.out.println(computer1);
		System.out.println();
		
		SmartPhone smartPhone1 = new SmartPhone("IPhone 14", 1000000, 10, 128);
		System.out.println(smartPhone1);
		
	}


}
