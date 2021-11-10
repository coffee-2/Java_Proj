package object06;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle() {} //기본 생성자는 생략 가능 
	                     //단, 다른 생성자가 없는 경우와 외부에서 호츨하지 않는 경우 불가능
	public int getArea() {
		return width * height;}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		
	
	
	}/////main
}////////class
