package sec04.exam02;

public class StocksEx {

	public static void main(String[] args) {

		Stocks s1 = new Stocks("P101001");
		s1.buy(30);
		s1.buy(50);
		s1.informProd();
		
		s1.sale(5);
		s1.informProd();

	}

}
