package day17;

//문서 상태 enum
enum DocumentStatus{
	DRAFT{

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "문서가 초안 상태입니다. 수정이 가능합니다.";
		}
		
	}, IN_REVIEW{

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "문서가 검토 중입니다. 수정이 제한됩니다.";
		}
		
	}, APPROVED{

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "문서가 승인되었습니다. 변경할 수 없습니다.";
		}
	}, REJECTED{

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "문서가 반려되었습니다. 다시 작성해주세요.";
		}
	};
	
	public abstract String getMessage();
	
}

public class EnumEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doucument doc = new Doucument("기획안 초안", DocumentStatus.DRAFT);
		doc.printStatus();
		
		doc.setStatus(DocumentStatus.IN_REVIEW);
		doc.printStatus();
		
		doc.setStatus(DocumentStatus.APPROVED);
		doc.printStatus();
		
		doc.setStatus(DocumentStatus.REJECTED);
		doc.printStatus();	

	}

}

//문서 클래스
class Doucument{
	private String title;
	private DocumentStatus status;
	
	public Doucument(String title, DocumentStatus documentStatus) {
		this.title = title;
		this.status = documentStatus;
	}
	
	
	public void setStatus(DocumentStatus status) {
		this.status = status;
	}


	public void printStatus() {
		System.out.println("["+title+"] 상태:"+status);
		System.out.println("-> " + status.getMessage());
	}
}

