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
		return ("����ȸ��: " + company + "\n����⵵: " + year + "\nũ��: " + size);
	}
	
}
