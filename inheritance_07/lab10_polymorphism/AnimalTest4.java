package inheritance_07.lab10_polymorphism;

import java.util.ArrayList;

public class AnimalTest4 {

	ArrayList<Animal> alist = new ArrayList<Animal>();
	
	public void addAnimal() { //ArrayList�� ��ü�� �߰��ϴ� �޼ҵ�
		alist.add(new Human());
		alist.add(new Tiger()); //��ü�� ArrayList�� ������ �� �� ��ĳ������ ��
		alist.add(new Eagle());
		for(Animal ani : alist) {ani.move();}	
	}
	
	public void downCasting() { //�ٿ� ĳ����
		for(int i=0; i<alist.size(); i++) {
			Animal ani = alist.get(i); //alist.get(i) : �� ���� ���� ������ �� ��
			if(ani instanceof Human) {
				Human h = (Human)ani; //�ٿ� ĳ����
				h.hand();}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani; //�ٿ� ĳ����
				t.stripe();}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani; //�ٿ� ĳ����
				e.wing();}
			else System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		AnimalTest4 at = new AnimalTest4();
		
		at.addAnimal();
		System.out.println();
		at.downCasting();
		
	}///main
}//////class
