package inheritance_07.lab8_p299;

public class SupersoincAirplane extends Airplane{
	public static final int normal = 1;		//stack 영역에 저장되는 상수
	public static final int supersonic = 2; //stack 영역에 지정되는 상수
	public int flymode = normal;
	
	@Override    //어노테이션. @Override : 메소드를 재정의 할때 오류 방지 위함.(검사)
				 //메소드 재정의[오버라이딩] : 부모클래스의 데이터 타입, 매개변수 개수, 순서
	public void fly() {
		if(flymode==2) {System.out.println("초음속 비행으로 전환합니다.");}
		else {super.fly();}
		}
	
}
