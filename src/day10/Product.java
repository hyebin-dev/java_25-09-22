package day10;

public class Product {
	/* 상품명, 가격
	 * */
	//멤버변수
	private String name;
	private int price;
	
	//생성자
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//상품추가 메서드
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//toString
	@Override
	public String toString() {
		return "[" + name + ":" + price + "]";
	}
	
}