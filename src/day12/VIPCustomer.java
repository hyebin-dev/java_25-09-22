package day12;

public class VIPCustomer extends Customer {
	// gold / vip  => 할인율 존재
	private double saleRetio;
	// agentNum / agentName
	private int agentNum;
	private String agentName;
	
	// 생성자
	public VIPCustomer() {}
	public VIPCustomer(int id, String name, int agentNum, String agentName) {
//		super(id, name);
		this.customerID = id;
		this.customerName = name;
		this.agentNum = agentNum;
		this.agentName = agentName;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.03;
		this.saleRetio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price - (int)(price * this.saleRetio);
	}
	
	@Override
	public void customerInfo() {
		// 기존내용 그대로 호출
		// - 전담 상담사는 짱구이고, 번호는 1111입니다. <- VIP만
		super.customerInfo();
		System.out.println("전담 상담사는 "+agentName+"이고, 번호는 "+agentNum+"입니다.");
	}
	
	public double getSaleRetio() {
		return saleRetio;
	}
	public void setSaleRetio(double saleRetio) {
		this.saleRetio = saleRetio;
	}
	public int getAgentNum() {
		return agentNum;
	}
	public void setAgentNum(int agentNum) {
		this.agentNum = agentNum;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@Override
	public String toString() {
		return "VIPCustomer [saleRetio=" + saleRetio + ", agentNum=" + agentNum + ", agentName=" + agentName + "]";
	}
	
}