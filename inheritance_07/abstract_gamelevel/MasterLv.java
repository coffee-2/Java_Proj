package inheritance_07.abstract_gamelevel;

public class MasterLv extends Playerlevel{

	@Override
	public void run() {System.out.println("���ƴٴմϴ�.");}

	@Override
	public void jump() {System.out.println("Fly!");}

	@Override
	public void turn() {System.out.println("�ѹ��� ���ϴ�!");}

	@Override
	public void showLVmeassge() {System.out.println("=====������ ����=====");}
	
}
