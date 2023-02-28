package sec06.exam01;

import sec04.exam02.Account;

public class BankExample {
	public static void main(String[] args) {
		Bank bank = new Bank();
				
		Customer customer1 = new Customer("È«±æµ¿");
		customer1.addAccount(new BankAccount(10000));
		bank.addCustomer(customer1);
		Customer customer2 = new Customer("°­°¨Âù");
		customer2.addAccount(new BankAccount(100));
		bank.addCustomer(customer2);
		Customer customer3 = new Customer("ÀÌ¼ø½Å");
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
		
		System.out.println("ÃÖ´ë±Ý¾×°èÁÂ°í°´: " + maxBalanceCustomer.getName() + ", ÀÜ¾×: " + max);
		System.out.println("ÃÖÀú±Ý¾×°èÁÂ°í°´: " + minBalanceCustomer.getName() + ", ÀÜ¾×: " + min);
		
		System.out.println("¸ðµç °í°´Á¤º¸");
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
