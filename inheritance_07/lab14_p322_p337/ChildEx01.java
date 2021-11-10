package inheritance_07.lab14_p322_p337;

public class ChildEx01 {
	public static void method1(Parent01 p) {
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			System.out.println("메소드1-Child01로 변환 성공");}
		else {System.out.println("변환 실패");}
	}
	
	public static void method2(Parent01 p) {
		Child01 c = (Child01)p;
		System.out.println("메소드2-Child01로 변환 성공");}
	
	public static void main(String[] args) {
		Parent01 pa = new Child01();
		method1(pa);
		method2(pa);
		
		Parent01 pb = new Parent01();
		method1(pb);
		method2(pb);
		
		
	}///main
}///////class
