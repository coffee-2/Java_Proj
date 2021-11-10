package object06;
                   
public class Circle {  //클래스 내부에는 필드(멤버 변수), 메소드, 생성자만 올 수 있다.
	int radius;
	String name;
	public Circle() {}      //기본 생성자 : 클래스 이름과 동일한 이름을 가진 메소드
	                        // - 인풋 매개변수와 실행부가 없는 생성자 = 기본 생성자
                            // - 기본 생성자는 생략이 가능
	                        // - 생성자는 리턴을 돌려주지 않는다.
	                        // - 그러므로 생성자 이름 앞에는 void (리턴이 없는 경우)
							//               자료형 명시 (리턴이 있는 경우)
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza;			//Circle : 객체형 자료형식  pizza : 참조변수
		pizza= new Circle();	//new : 생성자 호출, 메모리의 힙영역에 객체생성
		
		pizza.radius = 10;
		pizza.name = "어깨 피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
		
		
		Circle dounut = new Circle();
			dounut.radius = 2;
			dounut.name = "도넛";
			area = dounut.getArea();
			System.out.println(dounut.name + "의 면적은 " + area);
		
	}/////main
}////////class
