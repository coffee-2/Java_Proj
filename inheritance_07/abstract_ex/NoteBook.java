package inheritance_07.abstract_ex;

public abstract class NoteBook extends Computer{
					//�߻� Ŭ���� : ����Ŭ������ �޼ҵ带 �Ϻθ� ����
	
	@Override
	public void display() {System.out.println("��Ʈ�� �����");}
	
	public void nbonly() {System.out.println("��Ʈ�� �޼ҵ�");}
}
