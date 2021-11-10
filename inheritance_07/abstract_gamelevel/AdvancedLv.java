package inheritance_07.abstract_gamelevel;

public class AdvancedLv extends Playerlevel{

	@Override
	public void run() {System.out.println("빨리 달립니다.");}

	@Override
	public void jump() {System.out.println("jump!");}

	@Override
	public void turn() {System.out.println("turn 스킬을 배우지 않았습니다!");}

	@Override
	public void showLVmeassge() {System.out.println("=====중급자 레벨=====");}
	
	
	
	
	
	
}
