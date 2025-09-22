package examStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Student {
	//학번(stdNum), 이름, 나이, 전화번호, 주소, 수강과목
	private String stdNum;
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private String stdAddress;
	// 각자 본인이 신청한 수강목록
	private List<Subject> subject = new ArrayList<>(); // []
	
	
	//생성자
	public Student() {}

	public Student(String stdNum, String stdName, int stdAge, String stdPhone, String stdAddress) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdAddress = stdAddress;
	}

	public Student(String stdNum) {
		this.stdNum = stdNum;
	}
	
	// 필요한 메서드 추가
	// 개인 수강신청
	// 과목의 객체가 들어오면 내 수강리스트에 추가
	public void insertSubject(Subject s) {
		if(s == null) return;
		// 이미 존재하면 추가안됨.
		if(subject.contains(s)) {
			System.out.println("이미 있는 과목입니다.");
			return;
		}
		subject.add(s);
		System.out.println("수강신청완료!");
	}
	
	// 개인 수강철회
	// 과목번호를 주면 그 과목번호를 삭제하는 메서드를 추가
	public void deleteSubject(String subNum) {
		if(subject.remove(new Subject(subNum))) {
			System.out.println("수강삭제 완료!");
			return;
		}
		System.out.println("삭제할 과목이 없습니다.");
	}
	
	// 개인 수강목록 확인(print)
	public void printSubject() {
		if(subject.isEmpty()) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for(Subject s : subject) {
			System.out.println(s);
		}
	}
	
	// 내 정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(stdName+"("+stdNum+") /"+stdAge);
		System.out.println(stdPhone+" / "+ stdAddress);
	}
	
	// stdNum만 일치하면 일치하는 객체로 설정
	@Override
	public int hashCode() {
		return Objects.hash(stdNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stdNum, other.stdNum);
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdPhone=" + stdPhone
				+ ", stdAddress=" + stdAddress + ", subject=" + subject + "]";
	}
	

}