package sec03;

public class Employee extends Person {

	private String company;
	private String rank;
	private String department;
	
	public Employee(String name, int age) {
		super(name, age);
	}
	
	public Employee(String name, int age, String company, String rank, String department) {
		super(name, age);
		this.company = company;
		this.rank = rank;
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + "\n회사: " + company + "\n직급: " + rank + "\n부서: " + department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
