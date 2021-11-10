package array_05.enum_ex;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
						// 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
		//System.out.println(week);
		
		switch(week) {
		case 1 : today = Week.SATURDAY ; break;
		case 2 : today = Week.MONDAY ; break;
		case 3 : today = Week.TUESDAY ; break;
		case 4 : today = Week.WEDNESDAY ; break;
		case 5 : today = Week.THURSDAY ; break;
		case 6 : today = Week.FRIDAY ; break;
		case 7 : today = Week.SUNDAY ; break;
		}
		
		System.out.println("오늘의 요일은 " + today);
		if(today == Week.SATURDAY) {System.out.println("토요일은 축구 하는 날");}
		else System.out.println("수업 열심히 듣습니다.");
		
		
		
	}///main
}/////class
