package bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        BankController bc = new BankController();
        
        // 은행설정 
        bc.addBank();
        
        // 고객 등록 (통장 파일 자동 관리)
        bc.addCustomer();
        
        try {
        	bc.myBank(scan);
        	
        	while (true) {
        		System.out.println("\n=== 출납 업무 프로그램 ===");
        		System.out.println("1. 입금");
        		System.out.println("2. 출금");
        		System.out.println("3. 송금");
        		System.out.println("4. 계좌 확인");
        		System.out.println("5. 종료");
        		System.out.print("선택: ");
        		int choice = scan.nextInt();
        		
        		if (choice == 5) break;
        		
        		switch (choice) {
        		case 1: // 입금
        			bc.deposit(scan);
        			break;
        			
        		case 2: // 출금
        			bc.withdraw(scan);
        			break;
        			
        		case 3: // 송금
        			bc.transfer(scan);
        			break;
        			
        		case 4: // 계좌 확인
        			bc.accountPrint();
        			break;
        			
        		default:
        			System.out.println("잘못된 선택입니다.");
        		}
        	}
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
        scan.close();
        System.out.println("프로그램 종료!");
        


	}

}