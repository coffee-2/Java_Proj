package inheritance_07.abstract_gamelevel;

public abstract class Playerlevel {
	public abstract void run(); //레벨에 따라 달리는 속도가 차이남
	public abstract void jump();//레벨에 따라 다르게 점프
	public abstract void turn();//레벨에 따라 방향전환 속도 다름
	public abstract void showLVmeassge();//레벨의 정보 출력
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {jump();}
		turn();}
	
}
