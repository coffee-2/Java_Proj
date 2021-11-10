package inheritance_07.lab13_p314_p317;

public class Ex {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=17; i++) {int problem = car.run();
		
			switch(problem) {
				case 1 : System.out.println("앞왼쪽 HankookTire로 교체");
				 car.fL = new HankookTire("앞왼쪽", 15);
				 break;
				 
				case 2 : System.out.println("앞오른쪽 KumhoTire로 교체");
				 car.fR = new KumhoTire("앞오른쪽", 20);
				 break;
		
				case 3 : System.out.println("뒤왼쪽 KumhoTire로 교체");
				 car.bL = new KumhoTire("뒤왼쪽", 20);
				 break;
				 
				case 4 : System.out.println("뒤오른쪽 HankookTire로 교체");
				 car.bR = new HankookTire("뒤오른쪽", 15);
				 break;
			}
			System.out.println("------------------------------------");
		}
		
		
		
		
		
	}////main
}/////class
