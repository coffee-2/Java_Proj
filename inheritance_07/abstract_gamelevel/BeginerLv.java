package inheritance_07.abstract_gamelevel;

public class BeginerLv extends Playerlevel{

	@Override
	public void run() {System.out.println("천천히 달립니다.");}

	@Override
	public void jump() {System.out.println("jump 스킬을 배우지 않았습니다!");}

	@Override
	public void turn() {System.out.println("turn 스킬을 배우지 않았습니다!");}

	@Override
	public void showLVmeassge() {System.out.println("=====초보자 레벨=====");}
	
}
