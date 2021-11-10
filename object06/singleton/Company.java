package object06.singleton;

public class Company {
	//싱글톤 : 클래스에서 단 하나의 객체만 생성하도록 구현한 디자인 패턴
	
		private static Company instance = new Company();
		
		
		private Company() {} //외부 클래스에서 생성자를 호출 못하도록 설정
		
		public static Company getInstance() {//외부에서 객체를 생성할 때, 메소드를 호출해서
											 //객체가 생성되도록(리턴) 설정
				 							 //외부에서 객체 생성없이 클래스이름으로 호출 가능
			return instance;}
}
