package sec03;

public class Soldier extends Person {

	private String division; // 사단
	private String company; // 중대
	private String platoon; // 소대
	private String serialNumber; // 군번
	private String position; // 종과
	
	public Soldier(String name, int age) {
		super(name, age);
	}
	
	public Soldier(String name, int age, String division, String company, String platoon, String serialNumber, String position) {
		super(name, age);
		this.division = division;
		this.company = company;
		this.platoon = platoon;
		this.serialNumber = serialNumber;
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + "\n사단: " + division + "\n중대: " + company + "\n소대: " + platoon + "\n군번: " + serialNumber + "\n종과: " + position;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPlatoon() {
		return platoon;
	}

	public void setPlatoon(String platoon) {
		this.platoon = platoon;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
