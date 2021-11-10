package Practice.Fruit_;

import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> Flist = new ArrayList<Fruit>();
		
		Fruit apple = new Apple("���", "������", 3);		
		Fruit orange = new Orange("������", "��������", 5);
		Fruit banana = new Banana("�ٳ���", "�����", 6);
		
		Flist.add(apple);
		Flist.add(orange);
		Flist.add(banana);
		
		System.out.println("===== ���� =====");
		for(Fruit f : Flist) {System.out.println(f.showInfo());}
		
		/*
		System.out.println();
		System.out.println("===== �ٿ�ĳ���� =====");
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
			else System.out.println("���� Ÿ���Դϴ�.");
		}
		
		
		
	}////main
}///////class
