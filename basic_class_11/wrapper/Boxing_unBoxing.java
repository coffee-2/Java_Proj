package basic_class_11.wrapper;

public class Boxing_unBoxing {

	public static void main(String[] args) {
		Integer num1 = new Integer(100);
		int num2 = 200;
		
		int sum = num1 + num2;  //num1 자동으로 언박싱, num1.intValue()
		//int sum = num1.intValue() + num2;  *JAVA 5.0 이하
		
		Integer num3 = num2;   //오토 박싱 : Integer.valueof(num2)로 자동 변환
		//Integer num3 = Integer.valueOf(num2);  *JAVA 5.0 이하
		
		
	}///main
}//////class
