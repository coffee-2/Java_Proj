package object06;

public class Circle2 {// �����ڰ� 2���� Ŭ����, ������ �����ε�(���� �̸����� �Ű������� ���� ȣ��)
					  // �����ڴ� ��ü�� �ʱ�ȭ �ϴ� ����(��� ������ �⺻�� �Ҵ�)
	int radius;       // ��� ���� : ��ü�� ������ ����(�� ������ ������)
	String name;

	public Circle2() {
		radius = 1; name = "";}

	public Circle2(int r, String n) {
		radius = r; name = n;}

	public double getArea() {
		return 3.14 * radius * radius;}

	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "�� ����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);

		Circle2 dounut = new Circle2();
		dounut.name = "��� ����";
		area = dounut.getArea();
		System.out.println(dounut.name + "�� ������ " + area);

		
		
		
		
		
		
		
		
		
	}/// main
}////// class
