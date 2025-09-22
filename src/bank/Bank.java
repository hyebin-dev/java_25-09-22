package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String bankName;
	private List<Customer> customers = new ArrayList<>();
	
	public Bank() {}
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	// customer 추가
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	// customer 찾기
	public Customer findCustomer(String account) {
		for (Customer c : customers) {
			if(c.getAccount().equals(account)) {
				return c;
			}
		}
		return null; // 찾는 사람이 없다면...
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}