package controlStatement03;

import java.io.IOException;
import java.util.Scanner;

public class SwitchStatement {
	private static final String Bronze = null;
	private static final String Sliver = null;
	private static final String Gold = null;

	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
		 
			
		/*System.out.println("���ڸ� �Է��ϼ���.");
		int inputNumber=sc.nextInt();
		System.out.println("�Է��� ����:"+inputNumber);
		int remain=inputNumber%3;
		System.out.println("IF������ �������� �Ǵ�");
		if(remain==0) System.out.println("�������� 0");
		else if(remain==1) System.out.println("�������� 1");
		else System.out.println("�������� 2");
	
	
		System.out.println("switch������ �������� �Ǵ�");
		switch(remain) {case 0: System.out.println("�������� 0");
								break;
							case 1: System.out.println("�������� 1");
								break;
							default : System.out.println("�������� 2");}
		*/
	
		/*byte b=3;
		switch(b) {
			case 1: System.out.println("b�� ����� �� 1");
				break;//�ݵ�� break; �߰��ؾ���!
			case 2: System.out.println("b�� ����� �� 2");
				break;
			case 3: System.out.println("b�� ����� �� 3");
				break;
			case 4: System.out.println("b�� ����� �� 4");
				break;}*/
		
	
	//long ln=5; long���� �ȵ�!
		
	//���� ���
	/*System.out.println("ù��° ���� �Է�");
	int fnum=sc.nextInt();
	System.out.println("������ ��ȣ �Է�(+,-,*,/)");
	char op=(char)System.in.read();
	System.out.println("�ι�° ���� �Է�");
	int snum=sc.nextInt();
	System.out.printf("���%n");
	switch(op) {
	case '+' : System.out.printf("%d + %d = %d%n",fnum, snum,fnum+snum);
		break;
	case '-' :System.out.printf("%d - %d = %d%n",fnum, snum,fnum-snum);
		break;
	case '*' :System.out.printf("%d X %d = %d%n",fnum, snum,fnum*snum);
		break;
	case '/' :System.out.printf("%d / %d = %d%n",fnum, snum,fnum/snum);
		break;
	}*/
	
	/*System.out.println("���� �Է�");
	int inputNum = sc.nextInt();
	switch(inputNum) {
	case 1:
	case 2:
	case 100:
	case 200:
		System.out.println("1�̰ų� 2�̰ų� 100�̰ų� 200�� �ϳ�");
		break;
	case 300: System.out.println("300");
	}*/
	
	
	
	//��� ���ؼ� ���� ����ϱ�	 
		 
	/*System.out.println("���� ���� �Է�");
	int kor = sc.nextInt();
	System.out.println("���� ���� �Է�");
	int eng = sc.nextInt();
	System.out.println("���� ���� �Է�");
	int math = sc.nextInt();	 
	int Num2 = (kor + eng + math)/30;
	switch(Num2) {
	case 10: 
	case 9: System.out.println("A����"); break;
	case 8: System.out.println("B����"); break;
	case 7: 
	case 6: System.out.println("C����"); break;
	default : System.out.println("F����");
	}*/
	
		 
	  
	System.out.println("���� ���� �Է�");
	int kor = sc.nextInt();
	System.out.println("���� ���� �Է�");
	int eng = sc.nextInt();
	System.out.println("���� ���� �Է�");
	int math = sc.nextInt();
	int Num2 = (kor + eng + math)/3;
	switch(Num2) {
	case 100:
	case 99:
	case 98:
	case 97:
	case 96:
	case 95:
	case 94:
	case 93:
	case 92:
	case 91:
	case 90:
		System.out.printf("���:"+Num2 + "%n����:A");
		break;
	case 89:
	case 88:
	case 87:
	case 86:
	case 85:
	case 84:
	case 83:
	case 82:
	case 81:
	case 80:
	System.out.printf("���:"+Num2 + "%n����:B");
	break;
	case 79:
	case 78:
	case 77:
	case 76:
	case 75:
	case 74:
	case 73:
	case 72:
	case 71:
	case 70:
	case 69:
	case 68:
	case 67:
	case 66:
	case 65:
	case 64:
	case 63:
	case 62:
	case 61:
	case 60:
		System.out.printf("���:"+Num2 + "%n����:C");
		break;
	default : System.out.printf("���:"+Num2 + "%n����:F");}
	
	
	/*
	//�޴� �� ���
	System.out.println("�޴� ���� �Է����ּ���. (Gold or Silver or Bronze)");
	String medal = sc.next();
	switch(medal) {
	case "Gold" : System.out.println("�ݸ޴�"); break;
	case "Silver" : System.out.println("���޴�"); break;
	case "Bronze": System.out.println("���޴�");
	default : System.out.println("�޴��� �����ϴ�");
	}*/
	
	
	
	
	
	
	
	}///main
}
