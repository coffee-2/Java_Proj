package inheritance_07.lab1_p290;

public class DmbEx {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("������", "�Ͼ��", 9);
		
		System.out.println("�� : " + dmb.model);
		System.out.println("���� : " + dmb.color);
		System.out.println("ä�� : " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�÷ι� ����~~? ���� �����Ƿ�?!");
		dmb.sendVoice("������������ ���?");
		dmb.receiveVoice("�� ���� �������̾� ������ ��~");
		dmb.sendVoice("�˾Ҿ���� �����ϸ� ��ȭ�Ұ�");
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.change(10);
		dmb.turnOffDmb();
		
		
	}////main
}///////class
