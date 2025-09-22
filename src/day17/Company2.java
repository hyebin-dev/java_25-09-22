package day17;

public enum Company2 {
	SK("에스케이"),
	KT("케이티"),
	LG("엘지"),
	SAMSUNG("삼성"),
	APPLE("애플");
	
	private final String value;
	
	Company2(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}