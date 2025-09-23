package day16;

public class Customer implements Comparable<Customer> {
	private String name;
	private int age;
	private int price;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = age >=15 ? 100 : 80;
	}
	
	@Override
	public int compareTo(Customer o) {
		// this와 o를 비교 => 내림차순구현
		return o.getName().compareTo(this.getName());
	}
	
	@Override
	public String toString() {
		return "[name:" + name + ", age:" + age + ", price:" + price + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}
