package object06;

public class Car {  //������ �����ε� : ���� �̸��� �����ڿ��� ��ǲ���� ���� �ٸ��� ȣ��
	String company = "���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car() {}
	
	Car(String modle) { //input �Ű����� �̸�, �Ҵ��ϴ� �����̸�, �޸��� �����̸�
		this.model = modle;
	}
	
	Car(String model, String color) {
		this.model  = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}////class
