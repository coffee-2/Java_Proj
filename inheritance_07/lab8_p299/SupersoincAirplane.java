package inheritance_07.lab8_p299;

public class SupersoincAirplane extends Airplane{
	public static final int normal = 1;		//stack ������ ����Ǵ� ���
	public static final int supersonic = 2; //stack ������ �����Ǵ� ���
	public int flymode = normal;
	
	@Override    //������̼�. @Override : �޼ҵ带 ������ �Ҷ� ���� ���� ����.(�˻�)
				 //�޼ҵ� ������[�������̵�] : �θ�Ŭ������ ������ Ÿ��, �Ű����� ����, ����
	public void fly() {
		if(flymode==2) {System.out.println("������ �������� ��ȯ�մϴ�.");}
		else {super.fly();}
		}
	
}
