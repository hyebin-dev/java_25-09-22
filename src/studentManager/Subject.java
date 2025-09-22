package studentManager;

public class Subject {
	//과목코드, 과목명, 수강기간, 시수, 강사명, 강의장
	private String subNum;
	private String subName;
	private String subDate;
	private int subTime;
	private String subProfessor;
	private String subRoom;
	
	// 생성자
	public Subject() {}
	public Subject(String subNum, String subName) {
		this.subNum = subNum;
		this.subName = subName;
	}
	public Subject(String subNum, String subName, String subDate, int subTime, String subProfessor, String subRoom) {
		this.subNum = subNum;
		this.subName = subName;
		this.subDate = subDate;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subRoom = subRoom;
	}
	
	//메서드
	public void printSubject() {
		System.out.println(subName+"("+subNum+")");
	}
	
	public String getSubNum() {
		return subNum;
	}
	public void setSubNum(String subNum) {
		this.subNum = subNum;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubDate() {
		return subDate;
	}
	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubRoom() {
		return subRoom;
	}
	public void setSubRoom(String subRoom) {
		this.subRoom = subRoom;
	}
	@Override
	public String toString() {
		return "[subNum=" + subNum + ", subName=" + subName + ", subDate=" + subDate + ", subTime=" + subTime
				+ ", subProfessor=" + subProfessor + ", subRoom=" + subRoom + "]";
	}
		
}