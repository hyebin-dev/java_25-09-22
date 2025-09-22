package day15;

public class Order<K, V> extends Sale<K, V>{
	// 제네릭 상속
	private int count;
	private int total;
	
	public Order() {}
	public Order(K name, V price, int count) {
		super(name, price);
		this.count = count;
		this.total = (int)price * count;
	}
	public Order(Sale<K, V> s, int count) {
		super(s.getMenu(), s.getPrice());
		this.count = count;
		this.total = (int)s.getPrice() * count;
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
		return super.toString()+" "+ count + " = " + total;
	}
	
}
