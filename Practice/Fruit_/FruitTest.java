package Practice.Fruit_;

import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> Flist = new ArrayList<Fruit>();
		
		Fruit apple = new Apple("사과", "빨간색", 3);		
		Fruit orange = new Orange("오렌지", "오렌지색", 5);
		Fruit banana = new Banana("바나나", "노란색", 6);
		
		Flist.add(apple);
		Flist.add(orange);
		Flist.add(banana);
		
		System.out.println("===== 과일 =====");
		for(Fruit f : Flist) {System.out.println(f.showInfo());}
		
		/*
		System.out.println();
		System.out.println("===== 다운캐스팅 =====");
		Apple a = (Apple) apple;		
		a.app();
		Orange o = (Orange) orange;
		o.orn();
		Banana b = (Banana) banana;
		b.bana();
		*/
		
		System.out.println();
		for(int i=0; i<Flist.size(); i++) {
			Fruit f = Flist.get(i);
			if(f instanceof Apple) {Apple a = (Apple) f; a.app();}
			else if(f instanceof Orange) {Orange o = (Orange) f; o.orn();}
			else if(f instanceof Banana) {Banana b = (Banana) f; b.bana();}
			else System.out.println("없는 타입입니다.");
		}
		
		
		
	}////main
}///////class
