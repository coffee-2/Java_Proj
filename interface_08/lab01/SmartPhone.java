package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhoneinterface, MP3interface{
	//SmartPhone Ŭ������ PDA Ŭ������ ��ӹް� �ְ�, ��������� MP3 �������̽��� ���� 
	
	@Override
	public void sendcall() { //Phone1���� ����
		System.out.println("��ȭ�� �̴ϴ�.");} 

	@Override
	public void receivecall() { //Phone1���� ����
		System.out.println("��ȭ�� �޽��ϴ�.");} 
	

	@Override
	public void play() { //MP3���� ����
		System.out.println("������ ����մϴ�.");} 
	

	@Override
	public void stop() { //MP3���� ����
		System.out.println("���� ����� ����ϴ�.");} 

	@Override
	public void sendSMS() { //MobilePhone���� ����
		System.out.println("���ڸ� �����ϴ�.");} 

	@Override
	public void receiveSMS() { //MobilePhone���� ����
		System.out.println("���ڰ� �Խ��ϴ�.");} 
	
	public void schedule() {System.out.println("�޷��� �����մϴ�.");}
	
}///////class
