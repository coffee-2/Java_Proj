package array_05.enum_ex;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() : 열거 객체가 가지고 있는 문자열을 리턴
		Week today = Week.FRIDAY;
		String name = today.name();
		System.out.println("name : " + name);
		
		//ordinal() : 전체 열거 객체중 몇번째 열거 객체인지 알려줌
		int ordinal = today.ordinal();
		System.out.println("ordinal : " + ordinal);
		
		//compareTo() : 매개값으로 주어진 열거 객체를 기준으로 전후 몇번째에 위치하는지 알려줌
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		//valueOf() : 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이다.");}
			else System.out.println("평일이다.");
			}
		/*
		String arg0 = args[0];
		String arg1 = args[1];
		String arg2 = args[2];
		String arg3 = args[3];
		System.out.println(arg0 + " " + arg1 + " " + arg2 + " " + arg3);
		*/
		
		//values() : 모든 열거 객체들을 배열을 만들어 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}////main
}///////class
