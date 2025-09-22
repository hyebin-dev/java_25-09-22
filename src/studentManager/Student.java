package studentManager;

import java.util.Arrays;

public class Student {
	//학번(stdNum), 이름, 나이, 전화번호, 주소, 
    //수강과목(Subject[5] class), cnt
	private String stdNum;
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private String stdAddress;
	private Subject[] subject = new Subject[5]; // 각자 본인이 신청한 수강목록
	private int cnt; //수강과목수 (수강신청의 배열을 다루기 위한 index)
	
	//생성자
	public Student() {}

	public Student(String stdNum, String stdName, int stdAge, String stdPhone, String stdAddress) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdAddress = stdAddress;
	}

	public Student(String stdNum, String stdName) {
		this.stdNum = stdNum;
		this.stdName = stdName;
	}
	
	// 내가 필요한 메서드 추가하기
	// 수강과목의 객체(Subject)가 들어오면 내 수강배열에 추가
	public void insertSubject(Subject sub) {
		// 배열이 꽉 찼을 경우 arraycopy
		if(sub == null) {
			return;
		}
		if(cnt == subject.length) {
			// 배열 늘려주기
			Subject[] tmp = new Subject[subject.length+5];
			// 배열 복사
			System.arraycopy(subject, 0, tmp, 0, subject.length);
			// 기존 배열을 늘려준 배열로 바꾸기
			subject = tmp;
		}
		
		// 이미 수강신청을 한 과목일 경우
		for(int i=0; i<cnt; i++) {
			if(subject[i].getSubNum().equals(sub.getSubNum())) {
				System.out.println("이미 추가한 과목입니다.");
				return;
			}
		}
		subject[cnt] = sub;
		cnt++;
		System.out.println("수강신청 완료!");
	}
	
	// 과목번호를 주면 그 과목번호를 삭제하는 메서드를 추가
	public void deleteSubject(String subNum) {
		// subject 배열에서 subNum가 몇번지에 있는지 찾기
		int index = -1;
		if(subNum == null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subject[i].getSubNum().equals(subNum)) {
				index = i;
				break; // 번지를 찾았다면 for문을 벗어나기.
			}
		}
		if(index == -1) {
			// 찾는 값이 없다면...
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		// 삭제 : index 번지부터 뒷번지를 앞으로 옮기는 작업
		for(int i=index; i<cnt-1; i++) {
			subject[i] = subject[i+1];
		}
		
		// 마지막 끝번지는 null
		subject[cnt-1] = null;
		cnt--;
		System.out.println("수강철회 완료!");
	}
	
	// 내 정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(stdName+"("+stdNum+") /"+stdAge);
		System.out.println(stdPhone+" / "+ stdAddress);
	}
	
	// 내 수강정보를 출력하는 메서드
	public void printSubject() {
		if(cnt == 0) {
			System.out.println("수강과목이 없습니다.");
		}
		for(int i=0; i<cnt; i++) {
			subject[i].printSubject();
		}
		System.out.println("---------------");
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

	public Subject[] getSubject() {
		return subject;
	}

	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}

	public int getCnt() {
		return cnt;
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdPhone=" + stdPhone
				+ ", stdAddress=" + stdAddress + ", subject=" + Arrays.toString(subject) + ", cnt=" + cnt + "]";
	}
	
}