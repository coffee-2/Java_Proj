package stream_19.other;

import java.io.Console;

public class ConsoleTest {	//���������Ʈ���� �Է� �޵��� ��. ���������Ʈ���� ����.
							//1.8������ �۵�
		//������ �� bin �������� ������ ��!
		//java ��ü ��Ű�� �̸�.Ŭ�����̸�  ��) stream_19.other.ConsoleTest
	
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = console.readLine();
		
		System.out.println("������ �Է� �ϼ���");
		String job = console.readLine();
		
		System.out.println("��й�ȣ�� �Է� �ϼ���");
		char pass [] = console.readPassword();	//readPassword()
		String strPass = new String(pass);	//pass �迭�� ���� String ������ ��ȯ
		
		System.out.println("==================");
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
		
	}///main
}/////class
