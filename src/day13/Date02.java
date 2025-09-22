package day13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		// LocalDateTime
		LocalDateTime today = LocalDateTime.now(); //오늘날짜 리턴
		System.out.println(today);
		System.out.println(today.getYear());
		
		//객체를 String으로 변환 toString()
		String date = today.toString();
		System.out.println(date);
		System.out.println(date.substring(0, date.indexOf("T")));
		
		LocalDate today2 = LocalDate.now();
		System.out.println(today2);
		
		System.out.println();
		// yyyy yy MM dd hh:mm:ss
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime birth = 
				LocalDateTime.of(2009,9,30,8,30); // 날짜 생성
		
		System.out.println(dtf.format(birth));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		

	}

}
