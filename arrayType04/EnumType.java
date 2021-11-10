package arrayType04;

import java.util.Calendar;

public class EnumType {

	public static void main(String[] args) {
		Week today;
		today = Week.MONDAY;
		System.out.println("today:"+Week.MONDAY);
		
		//name( )메소드
		String name = today.name();
		System.out.println(name);
		//ordinal( )메소드
		System.out.println(today.ordinal());		
		//compareTo( )메소드
		Week day1= Week.MONDAY;
		Week day2= Week.TUESDAY;
		int result = day2.compareTo(day1);
		System.out.println(result);
		//valueOf 메소드
		Week weekDay=Week.valueOf("SATURDAY");
		System.out.println(weekDay);
		
		
		Calendar cal = Calendar.getInstance();
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		Week tday = Week.MONDAY;
		switch(wk) {
		case 1: tday=Week.SUNDAY;break;
		case 2: tday=Week.MONDAY;break;
		case 3: tday=Week.TUESDAY;break;
		case 4: tday=Week.WENDESDAY;break;
		case 5: tday=Week.THRSDAY;break;
		case 6: tday=Week.FRAIDAY;break;
		case 7: tday=Week.SATURDAY;break;
		}
		System.out.println("오늘의 요일:"+tday);
		
		
		

	}///main
}//////class
