package object06;

public class Circle2 {// 생성자가 2개인 클래스, 생성자 오버로딩(같은 이름으로 매개변수에 따라서 호출)
					  // 생성자는 객체를 초기화 하는 역할(멤버 변수에 기본값 할당)
	int radius;       // 멤버 변수 : 객체에 설정된 변수(힙 영역에 생성됨)
	String name;

	public Circle2() {
		radius = 1; name = "";}

	public Circle2(int r, String n) {
		radius = r; name = n;}

	public double getArea() {
		return 3.14 * radius * radius;}

	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "얼굴 피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle2 dounut = new Circle2();
		dounut.name = "어깨 피자";
		area = dounut.getArea();
		System.out.println(dounut.name + "의 면적은 " + area);

		
		
		
		
		
		
		
		
		
	}/// main
}////// class
