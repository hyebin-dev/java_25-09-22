package day13;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 시간 클래스
		/* Date 클래스 => Deprecated(비권장) 
		 * Calendar / LocalDateTime 
		 * */
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		//월 0~11로 표현 +1
		System.out.println(c.get(Calendar.MONTH)+1); 
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// 일(1) ~ 토(7)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// 2025-9-11 (목)
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		String weekStr = "";
		
		switch(week) {
		case 1: weekStr = "일"; break;
		case 2: weekStr = "월"; break;
		case 3: weekStr = "화"; break;
		case 4: weekStr = "수"; break;
		case 5: weekStr = "목"; break;
		case 6: weekStr = "금"; break;
		case 7: weekStr = "토"; break;
		default: break;
		}
		
		System.out.println(year+"-"+month+"-"+day+"("+weekStr+")");
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		// ampm => 0(am) 1(pm)
		System.out.println(c.get(Calendar.AM_PM));
		
		// 오후 2:48:13
		int ampm = c.get(Calendar.AM_PM);
		String[] ampmString = {"오전","오후"};
		
		System.out.println((ampm==1? "오후 ":"오전 ")+hour+":"+minute+":"+second);
		System.out.println(ampmString[ampm]+" "+hour+":"+minute+":"+second);
		

	}

}