package inheritance_07.abstract_gamelevel;

public abstract class Playerlevel {
	public abstract void run(); //������ ���� �޸��� �ӵ��� ���̳�
	public abstract void jump();//������ ���� �ٸ��� ����
	public abstract void turn();//������ ���� ������ȯ �ӵ� �ٸ�
	public abstract void showLVmeassge();//������ ���� ���
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {jump();}
		turn();}
	
}
