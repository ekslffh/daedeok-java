package sec03.exam01;

public enum Operation {
	
	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIED("/") {
		public double apply(double x, double y) {
			return x / y;
		}
	};
	
	private String symbol;
	
	Operation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
	
	public abstract double apply(double x, double y);
	
}
