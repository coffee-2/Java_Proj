package interface_08.lab02_Scheduler;

public class Leastjob implements Scheduler{
	//���� �������� ���ų� ��� ��Ⱑ ���� ���� �������� ��ȭ �ѱ��

	@Override
	public void getNextcall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");}

	@Override
	public void sendcallToAgent() {
		System.out.println("���� �������� ���ų� ����Ⱑ ���� �������� ��ȭ�� �����մϴ�.\r\n");} 
	
}
