package day12;

public class GoldCustomer extends Customer{
	
	// gold / vip  => 할인율 존재
	private double saleRetio;
	
	//생성자
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(id, name);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		this.saleRetio = 0.1;
	}
	
	
	@Override
	public int calcPrice(int price) {
		// 부모의 메서드 중 자식이 수정해야될 내용이 있는 메서드만 오버라이드
		// 구매금액의 본인의 비율만큼 곱해서 보너스 포인트를 누적하고, 구매금액을 리턴
		super.calcPrice(price);
		//super.setBonusPoint(super.getBonusPoint()+누적값);
		return price - (int)(price * this.saleRetio);
	}
	
	public double getSaleRetio() {
		return saleRetio;
	}
	public void setSaleRetio(double saleRetio) {
		this.saleRetio = saleRetio;
	}
	@Override
	public String toString() {
		return "GoldCustomer [saleRetio=" + saleRetio + "]";
	}
	
}
