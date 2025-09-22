package day17;

enum Category{
	// 상품 카테고리 
	FOOD(0.1),   // 식품 : 10%
	CLOTHING(0.08),  //의류 : 8%
	ELECTRONICS(0.15); //전자제품: 15%
	
	private final double vatRate;
	
	Category(double vatRate) {
		this.vatRate = vatRate;
	}

	public double getVatRate() {
		return vatRate;
	}
	
}

public class EnumEx01 {

	public static void main(String[] args) {
		// 물건의 객체를 생성하고, 물건의 정보를 출력
		Product p = new Product("맥북프로", Category.ELECTRONICS, 2000000);
		System.out.println(p);
		System.out.println("정가:"+p.getPriceWithVAT());
		
		Product p2 = new Product("가을 자켓", Category.CLOTHING, 100000);
		System.out.println(p2);
		System.out.println("정가:"+p2.getPriceWithVAT());

	}

}

// 상품 클래스 : name, Category, price(원가)
class Product{
	private String name;
	private Category category;
	private int price;
	
	public Product(String name, Category category, int price) {
		this.name = name;
		this.category= category;
		this.price = price;
	}
	
	// 부가세 포함 가격 계산
	public int getPriceWithVAT() {
		double vat = price * category.getVatRate();
		return (int)(price + vat);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
