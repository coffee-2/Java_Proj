package interface_08.lab02_Scheduler;

public class RoundRobin implements Scheduler{
	//���� �Ѹ� ���ư��� �����ϰ� ������ ���

	@Override
	public void getNextcall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");}

	@Override
	public void sendcallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.\r\n");}
	
	
}
