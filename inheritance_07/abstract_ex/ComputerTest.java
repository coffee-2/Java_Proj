package inheritance_07.abstract_ex;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
		//Copmuter c1 = new Computer(); //추상 클래스이므로 객체 생성 불가
		Computer c2 = new Desktop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		System.out.println("===========DeskTop 객체 정보===========");
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		
		System.out.println("===========MyNoteBook 객체 정보===========");
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
		
		System.out.println("=====각각의 클래스 메소드 호출=====");
		Desktop dt = (Desktop)c2;
		dt.dtonly();
		MyNoteBook my = (MyNoteBook)c4;
		my.nbonly();
		my.myonly();
		
		System.out.println("=====각 클래스를 ArrayList안에 저장 후 출력=====");
		ArrayList<Computer> com = new ArrayList<Computer>();
		
		com.add(c2);
		com.add(c4);
		
		/*
		Desktop dd = (Desktop) com.get(0);
		dd.dtonly();
		MyNoteBook mb = (MyNoteBook) com.get(1);
		mb.nbonly();
		mb.myonly();
		*/
	    
		for(int i=0; i<com.size(); i++) {
			Computer c = com.get(i);
			if(c instanceof Desktop) {Desktop d = (Desktop)c; d.dtonly();}
			else if(c instanceof MyNoteBook) {MyNoteBook mn = (MyNoteBook)c;
					mn.nbonly();  mn.myonly();}
			}
		
		
	}///main
}//////class
