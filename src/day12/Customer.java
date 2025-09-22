package day12;

public class Customer {
/*고객ID : int customerID
* 고객이름 : String customerName
* 고객등급 : String customerGrade
* 보너스포인트 : int bonusPoint
* 적립비율 : double bonusRatio
*/
	// 멤버변수 선언.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	// silver 등급만 처리
	// 1. 보너스 적립 계산 메서드 (calcPrice)
	// 리턴 타입 : 할인율을 적용한 구매금액 (int) / 매개변수: int price
	public int calcPrice(int price) {
		int point = (int)(price * bonusRatio);
		this.bonusPoint += point;
		// 실버등급은 할인율이 없음. 
		return price;
	}
	
	// 2. 출력메서드
	//- 홍길동 님은 VIP고객이며, 현재 보너스포인트는 1000점입니다.
	public void customerInfo() {
		System.out.print(customerName+"님은 "+ customerGrade+"고객이며,");
		System.out.println("현재 보너스포인트는 "+bonusPoint+"점 입니다.");
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}


}