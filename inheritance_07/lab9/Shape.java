package inheritance_07.lab9;

class Shape {//슈퍼 클래스, 오버라이딩을 사용해 다형성 구현
	public Shape next;
	public Shape() {next = null;}
	public void draw() {System.out.println("Shape");}
}

class Line extends Shape{
	public void draw() {System.out.println("Line");}
}

class Rect extends Shape{
	public void draw() {System.out.println("Rect");}
}

class Circle extends Shape{
	public void draw() {System.out.println("Circle");}
}
