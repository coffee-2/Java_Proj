package interface_08.lab02_Scheduler;

public class PriorityAllocation implements Scheduler{
	//�� ����� ���� ������� �����ɷ��� ���� ������ �켱 ����

	@Override
	public void getNextcall() {
		System.out.println("����� ���� ���� ��ȭ�� �켱������ �������� �����մϴ�.");}

	@Override
	public void sendcallToAgent() {
		System.out.println("���� ��ų�� ���� �������� �켱������ ��ȭ�� �����մϴ�.\r\n");}
	
	
}
