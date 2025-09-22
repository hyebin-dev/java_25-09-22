package day10;

public class Order extends Product {
	// name, price, toString
	private int count; //주문수량
	private int total; // 최종주문금액 (한 주문에 대한 최종)
	
	public Order() {}
	public Order(String name, int price, int count) {
		super(name, price);
		this.count = count;
		this.total = price * count;
	}
	
	// total 계산 메서드
	public void totalCalc() {
		this.total = super.getPrice() * this.count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "[" +super.getName()+" "+super.getPrice()+ " " 
				+count + "  " + total + "]";
	}
	
}