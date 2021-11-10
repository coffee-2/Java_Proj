package inheritance_07.abstract_ex;

public abstract class NoteBook extends Computer{
					//추상 클래스 : 슈퍼클래스의 메소드를 일부만 구현
	
	@Override
	public void display() {System.out.println("노트북 모니터");}
	
	public void nbonly() {System.out.println("노트북 메소드");}
}
