package inheritance_07.abstract_gamelevel;

public class BeginerLv extends Playerlevel{

	@Override
	public void run() {System.out.println("õõ�� �޸��ϴ�.");}

	@Override
	public void jump() {System.out.println("jump ��ų�� ����� �ʾҽ��ϴ�!");}

	@Override
	public void turn() {System.out.println("turn ��ų�� ����� �ʾҽ��ϴ�!");}

	@Override
	public void showLVmeassge() {System.out.println("=====�ʺ��� ����=====");}
	
}
