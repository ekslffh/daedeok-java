package sec06.exam01;

public class Bank {
	// 은행고객목록, 은행고객수
	private Customer[] customers = new Customer[10];
	public int numberOfCustomers;
	// 생성자
	public Bank() {
		
	}; // 기본 생성자
	
	public Bank(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer;
	}
	
	public int getNumberOfCustomers() { // 고객의 수 반환
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() { // 전체 고객정보 반환
		return customers;
	}
	
	public Customer getCustomers(int idx) {
		return customers[idx];
	}
	
}
