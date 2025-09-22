package bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Customer {
	/* Customer 클래스 (계좌생성)
		은행명	예금주명	계좌번호	잔액
		- 입금	- 출금	- 송금(타 계좌로 송금)	- 통장 출력
	 * */
	private String bankName; //은행명
	private String name; //예금주명
	private String account; //계좌번호
	private int balance; //잔액
	
	public Customer(String bankName, String name, String account, int balance) {
		this.bankName = bankName;
		this.name = name;
		this.account = account;
		this.balance = balance;
		// 최근 거래내역을 반영한 잔액 설정
		loadFromFile(); 
	}
	
	// 파일이름 리턴 메서드
	private String getFileName() {
		return name+"_"+bankName+".txt";
	}
	
	// 파일에 기록
	private void fileSave(String action, int amount) {
		try {
			FileWriter fw = new FileWriter(getFileName(), true);
			PrintWriter pw = new PrintWriter(fw);
			String data = action+" : " + amount+"원,  현재잔액: "+this.balance+"원";
			System.out.println(data);
			pw.println(data);
			fw.close();
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//입금
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println(amount+"원 입금완료.  현재잔액: "+this.balance+"원");
		// 파일로 출력
		fileSave("입금", amount);
	}
	
	//출금
	public void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("잔액부족! 출금실패!!");
			return;
		}
		
		this.balance -= amount;
		System.out.println(amount+"원 출금완료.  현재잔액: "+this.balance+"원");
		// 파일로 출력
		fileSave("출금", amount);
	}
	
	//송금
	public void transfer(Customer to, int amount) {
		if(this.balance < amount) {
			System.out.println("잔액부족! 송금실패!!");
			return;
		}
		this.balance -= amount;
		to.setBalance(to.getBalance()+amount); // 상대방
		System.out.println(to.getName()+"님께 "+ amount+"원 송금완료.  "
				+ "현재잔액: "+this.balance+"원");
		// 파일로 출력
		fileSave("송금 -> "+to.getName(), amount);
		to.fileSave("송금 <- "+this.name, amount); // 상대방
		
	}
	
	//통장내역출력
	public void showAccountInfo() {
		System.out.println("계좌번호:"+account+", 이름:"+name+
				", 은행:"+bankName+", 잔액:"+balance);
		System.out.println("--거래내역(최근)--");
		
		//파일 읽어오기
		try {
			BufferedReader br = new BufferedReader(new FileReader(getFileName()));
			String line=null;
						
			while((line = br.readLine())!=null) {
				System.out.println(" - "+ line);
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("거래내역이 없습니다.");
		}
		
	}
	
	// 최종 잔액 불러오기 (마지막줄 읽기)
	private void loadFromFile() {
		File file = new File(getFileName());
		if(!file.exists()) return;
		
		//파일 읽어오기
		try {
			BufferedReader br = new BufferedReader(new FileReader(getFileName()));
			String line=null;
			String lastLine = null;
			
			while((line = br.readLine())!=null) {
				lastLine = line;
			}
			
			if(lastLine != null && lastLine.contains("현재잔액")) {
				String[] p = lastLine.split("현재잔액: ");
				balance = Integer.parseInt(p[1].replace("원", "").trim()); 
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("거래내역이 없습니다.");
		}
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [bankName=" + bankName + ", name=" + name + ", account=" + account + ", balance=" + balance
				+ "]";
	}
	
}