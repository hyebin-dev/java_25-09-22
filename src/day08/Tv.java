package day08;

public class Tv {
	// 멤버변수 : brand, power, ch, vol
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	// 선호채널 배열
	private int[] faver = new int[5];
	private int count;
	
	// 기본생성자, brand만 받는 생성자
	public Tv() {
		ch = 1;
		vol = 3;
	}
	public Tv(String brand) {
		this(); // 생성자 호출 : 첫줄에서만 가능
		this.brand = brand;
	}
	
	// pick() : 선호채널로 등록
	public void pick() {
		// count는 faver의 번지 역할을 하는 변수
		if(faver.length  == count) {
			count=0;
		}
		faver[count] = ch;
		count++;
		System.out.println(ch+"번을 선호채널로 등록합니다.");
	}
	
	// faverPrint() : 선호채널 출력
	public void faverPrint() {
		System.out.println("--선호채널 목록--");
		for(int i=0; i<faver.length; i++) {
			if(faver[i]==0) {
				System.out.println("💥");
			}else {
				System.out.println(faver[i]);				
			}
		}
	}
	
	// 메서드 : 
	/* power()
	 * chUP() / chDown()  => 0 ~ 20까지 순환구조
	 * 1씩 증가 / 감소
	 * 
 	 * volUP() / volDown() => 1씩 증가 / 감소
 	 * 0 ~ 10 10이 넘으면 10~ , 0보다 작으면 음소거라고 출력
	 * */
	public void power() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜집니다.");
		}else {
			System.out.println("전원이 꺼집니다.");
		}
	}
	public void chUP() {
		if(power) {
			ch++;	
			if(ch>20) {
				ch=1;
			}
			System.out.println("ch:"+ch);
		}
	}
	public void chDown() {
		if(power) {
			ch--;	
			if(ch<1) {
				 ch=20;
			}
			System.out.println("ch:"+ch);
		}
	}
	
	public void volUp() {
		if(power) {
			vol++;
			if(vol > 10) {
				vol = 10;
			}
			System.out.println("vol:"+vol);
		}
	}
	public void volDown() {
		if(power) {
			vol--;
			if(vol <=0) {
				System.out.println("음소거");
				vol = 0;
				return;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", power=" + power + ", ch=" + ch + ", vol=" + vol + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
		

}
