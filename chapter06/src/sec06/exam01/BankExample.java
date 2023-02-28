package sec06.exam01;

import sec04.exam02.Account;

public class BankExample {
	public static void main(String[] args) {
		Bank bank = new Bank();
				
		Customer customer1 = new Customer("ȫ�浿");
		customer1.addAccount(new BankAccount(10000));
		bank.addCustomer(customer1);
		Customer customer2 = new Customer("������");
		customer2.addAccount(new BankAccount(100));
		bank.addCustomer(customer2);
		Customer customer3 = new Customer("�̼���");
		customer3.addAccount(new BankAccount(5000));
		bank.addCustomer(customer3);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		Customer maxBalanceCustomer = null;
		Customer minBalanceCustomer = null;
		
		for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
			Customer customer = bank.getCustomers(i);
			if (customer.getAccount(0).getBalance() > max) {
				max = customer.getAccount(0).getBalance();
				maxBalanceCustomer = customer;
			}
			if (customer.getAccount(0).getBalance() < min) {
				min = customer.getAccount(0).getBalance();
				minBalanceCustomer = customer;
			}
		}
		
		System.out.println("�ִ�ݾװ��°�: " + maxBalanceCustomer.getName() + ", �ܾ�: " + max);
		System.out.println("�����ݾװ��°�: " + minBalanceCustomer.getName() + ", �ܾ�: " + min);
		
		System.out.println("��� ������");
		for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
			Customer customer = bank.getCustomers(i);
			System.out.println(customer.getName());
			for (int j = 0; j < customer.getNumberOfAccounts(); j++) {
				BankAccount bankAccount = customer.getAccount(j);
				System.out.println(bankAccount.getBalance());
			}
		}
	}
}
