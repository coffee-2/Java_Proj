package lamda_14.lamda.lab01;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//1. 객체 지향으로 출력 - 객체의 메소드로 호출
		//쿠현 클래스 성생, 여러번 사용하는 메소드
		StringConcatImpl c1 = new StringConcatImpl();
		c1.makeString(s1, s2);
		
		//2. 람다식을 사용하여 출력
		//구현 클래스 없이 작동, 임시적으로 사용
		StringConcat c2 = (s, v) -> System.out.println(s+" "+v);
		c2.makeString(s1, s2);
		
		//3. 익명 내부 클래스를 사용해 출력
		//구현 클래스를 내부에서 생성, 임시적으로 사용
		StringConcat c3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+" "+s2);}
		};
		c3.makeString(s1, s2);
		
		
	}///main
}//////class
