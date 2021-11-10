package object06.final_ex;

public class Person {
	final String nation = "Korea";
	//final : 변수 앞에 <== 상수(값 변경 X)
	//final : 클래스 앞에 <== 자식객체를 허용하지 않음(상속 X)
	//final : 메소드 앞에 <== 메소드 오버라이딩 불가(상속 X)
		//메소든 오버라이딩 : 상속 관계에서 부모 클래스에서 선언된 메소드를 자식 클래스에서 재정의
		//메소드 오버로딩 : 동일한 메소드 이름으로 매개변수를 달리해서 메소드를 실행
final String ssn;
 String name;

public Person(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;}
}
