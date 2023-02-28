package sec06.exam01;

public class Bank {
	// ��������, �������
	private Customer[] customers = new Customer[10];
	public int numberOfCustomers;
	// ������
	public Bank() {
		
	}; // �⺻ ������
	
	public Bank(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer;
	}
	
	public int getNumberOfCustomers() { // ���� �� ��ȯ
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() { // ��ü ������ ��ȯ
		return customers;
	}
	
	public Customer getCustomers(int idx) {
		return customers[idx];
	}
	
}
