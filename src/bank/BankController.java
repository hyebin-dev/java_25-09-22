package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController {
	
	private List<Bank> bank = new ArrayList<>();
	private Customer myBank;

	public void addBank() {
		// TODO Auto-generated method stub
		bank.add(new Bank("우리은행"));
		bank.add(new Bank("신한은행"));
	}

	public void addCustomer() {
		// TODO Auto-generated method stub
		//우리은행
		bank.get(0).addCustomer(new Customer(bank.get(0).getBankName(), "홍길동", "1001", 10000));
		bank.get(0).addCustomer(new Customer(bank.get(0).getBankName(), "이순신", "1002", 10000));
		bank.get(0).addCustomer(new Customer(bank.get(0).getBankName(), "짱구", "1003", 10000));
		//신한은행
		bank.get(1).addCustomer(new Customer(bank.get(1).getBankName(), "홍길동", "2001", 10000));
		bank.get(1).addCustomer(new Customer(bank.get(1).getBankName(), "짱아", "2002", 10000));
		bank.get(1).addCustomer(new Customer(bank.get(1).getBankName(), "강감찬", "2003", 10000));
		
	}

	public void myBank(Scanner scan) {
		// 내 계좌설정
		System.out.println("--내 계좌 설정--");
		this.myBank = searchBank(scan);
		if(this.myBank == null) {
			throw new RuntimeException();
		}
		myBank.showAccountInfo();
		
	}

	private Customer searchBank(Scanner scan) {
		// 내 계좌 리턴
		System.out.println("은행>");
		System.out.println("1.우리은행\n2.신한은행");
		String num = scan.next();
		if(!(num.equals("1") || num.equals("2"))) {
			System.out.println("은행선택오류!!");
			return null;
		}
		
		String bank = num.equals("1") ? "우리은행" : "신한은행";
		
		System.out.println("계좌번호입력 >");
		String account = scan.next();
		
		Customer customer = null;
		for(Bank b : this.bank) {
			if(b.getBankName().equals(bank)) {
				customer = b.findCustomer(account);
				if(customer == null) {
					System.out.println("해당 계좌가 존재하지 않습니다.");
					break;
				}
			}
		}
		return customer;
	}

	public void deposit(Scanner scan) {
		// 입금메뉴
		System.out.println("입금금액 >");
		int amount = scan.nextInt();
		myBank.deposit(amount);
		
	}

	public void withdraw(Scanner scan) {
		// 출금메뉴
		System.out.println("출금금액 >");
		int amount = scan.nextInt();
		myBank.withdraw(amount);
	}

	public void transfer(Scanner scan) {
		// 송금메뉴
		System.out.println("송금할 은행 / 계좌번호 입력 >");
		Customer toCustomer = searchBank(scan);
		
		if(toCustomer == null) {
			System.out.println("상대 계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("송금금액 >");
		int amount = scan.nextInt();
		myBank.transfer(toCustomer, amount);
	}

	public void accountPrint() {
		// 내 계좌 확인
		myBank.showAccountInfo();
	}

}
