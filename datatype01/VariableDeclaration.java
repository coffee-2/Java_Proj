package datatype01;

public class VariableDeclaration {
	public static void main(String[] args) {
		System.out.println("[���� ���� ��� ù ��°]");
		//�ڷ���(data type)������
		int num;//int��(����-����) ������ �� �ִ� num�̶�� �̸��� �޸𸮸� �Ҵ����ּ���.
		num = 10;//���� �ʱ�ȭ
		
		int bNum = 0B1010;//2����
		int cNum = 012;//8����
		int dNum = 0xA;//16����
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(cNum);
		System.out.println(dNum);
		
		System.out.println("[���� ���� ��� �� ��°]");
		int initNUm = 200;//����� ���ÿ� 
		System.out.println(initNUm);
		
		System.out.println("[���� ���� ��� �� ��°-���ÿ� ���� Ÿ���� ���� ������ �����ϱ�]");
		int fnum,snum=300,tnum;
		fnum = snum;
		
		System.out.println(fnum);
		
		//fnum = snum + tnum;
		tnum = 500;
		System.out.println(snum+tnum);
		
	}
}
