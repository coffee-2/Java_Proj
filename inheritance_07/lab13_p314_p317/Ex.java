package inheritance_07.lab13_p314_p317;

public class Ex {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=17; i++) {int problem = car.run();
		
			switch(problem) {
				case 1 : System.out.println("�տ��� HankookTire�� ��ü");
				 car.fL = new HankookTire("�տ���", 15);
				 break;
				 
				case 2 : System.out.println("�տ����� KumhoTire�� ��ü");
				 car.fR = new KumhoTire("�տ�����", 20);
				 break;
		
				case 3 : System.out.println("�ڿ��� KumhoTire�� ��ü");
				 car.bL = new KumhoTire("�ڿ���", 20);
				 break;
				 
				case 4 : System.out.println("�ڿ����� HankookTire�� ��ü");
				 car.bR = new HankookTire("�ڿ�����", 15);
				 break;
			}
			System.out.println("------------------------------------");
		}
		
		
		
		
		
	}////main
}/////class
