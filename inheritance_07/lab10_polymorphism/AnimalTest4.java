package inheritance_07.lab10_polymorphism;

import java.util.ArrayList;

public class AnimalTest4 {

	ArrayList<Animal> alist = new ArrayList<Animal>();
	
	public void addAnimal() { //ArrayList에 객체를 추가하는 메소드
		alist.add(new Human());
		alist.add(new Tiger()); //객체가 ArrayList에 저장이 될 때 업캐스팅이 됨
		alist.add(new Eagle());
		for(Animal ani : alist) {ani.move();}	
	}
	
	public void downCasting() { //다운 캐스팅
		for(int i=0; i<alist.size(); i++) {
			Animal ani = alist.get(i); //alist.get(i) : 각 방의 값을 가지고 올 때
			if(ani instanceof Human) {
				Human h = (Human)ani; //다운 캐스팅
				h.hand();}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani; //다운 캐스팅
				t.stripe();}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani; //다운 캐스팅
				e.wing();}
			else System.out.println("지원되지 않는 타입입니다.");
		}
	}
	
	public static void main(String[] args) {
		AnimalTest4 at = new AnimalTest4();
		
		at.addAnimal();
		System.out.println();
		at.downCasting();
		
	}///main
}//////class
