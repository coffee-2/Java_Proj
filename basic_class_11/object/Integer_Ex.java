package basic_class_11.object;

public class Integer_Ex {
	
	
	public static void main(String[] args) {
		//Integer 도 toString() 메소드가 재정의 되어있음. 숫자 리턴
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1==i2);			//객체의 주소를 비교
		System.out.println(i1.equals(i2));  //객체의 값을 비교
		
		
		Integer i3 = 300;
		Integer i4 = 300;
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		
	}///main
}//////class
