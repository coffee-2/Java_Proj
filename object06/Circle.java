package object06;
                   
public class Circle {  //Ŭ���� ���ο��� �ʵ�(��� ����), �޼ҵ�, �����ڸ� �� �� �ִ�.
	int radius;
	String name;
	public Circle() {}      //�⺻ ������ : Ŭ���� �̸��� ������ �̸��� ���� �޼ҵ�
	                        // - ��ǲ �Ű������� ����ΰ� ���� ������ = �⺻ ������
                            // - �⺻ �����ڴ� ������ ����
	                        // - �����ڴ� ������ �������� �ʴ´�.
	                        // - �׷��Ƿ� ������ �̸� �տ��� void (������ ���� ���)
							//               �ڷ��� ��� (������ �ִ� ���)
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza;			//Circle : ��ü�� �ڷ�����  pizza : ��������
		pizza= new Circle();	//new : ������ ȣ��, �޸��� �������� ��ü����
		
		pizza.radius = 10;
		pizza.name = "��� ����";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ "+area);
		
		
		Circle dounut = new Circle();
			dounut.radius = 2;
			dounut.name = "����";
			area = dounut.getArea();
			System.out.println(dounut.name + "�� ������ " + area);
		
	}/////main
}////////class
