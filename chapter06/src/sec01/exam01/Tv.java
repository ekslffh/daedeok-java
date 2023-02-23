package sec01.exam01;

public class Tv {
	
	private String company;
	private int year;
	private double size;
	
	public Tv(String company, int year, double size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return ("제조회사: " + company + "\n생산년도: " + year + "\n크기: " + size);
	}
	
}
