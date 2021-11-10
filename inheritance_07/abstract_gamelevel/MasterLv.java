package inheritance_07.abstract_gamelevel;

public class MasterLv extends Playerlevel{

	@Override
	public void run() {System.out.println("날아다닙니다.");}

	@Override
	public void jump() {System.out.println("Fly!");}

	@Override
	public void turn() {System.out.println("한바퀴 돕니다!");}

	@Override
	public void showLVmeassge() {System.out.println("=====마스터 레벨=====");}
	
}
