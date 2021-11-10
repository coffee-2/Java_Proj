package lamda_14.innerclass;


class OutClass {		//�ܺ� Ŭ����
	
	private int num = 10;
	private static int snum = 20;	//��üȭ ���̵� ���(Ŭ���� �̸����� ȣ��)
	
	private InClass inclass;	//�ܺ��� Ŭ������ ��üȭ �� ��, ���� Ŭ������ ��üȭ �ϱ� ���� ����
	
	public OutClass() {	//������ : �ܺ� Ŭ������ ������ ȣ��� ���� Ŭ������ ��üȭ
		inclass = new InClass();}	
	
	void outTest1() {System.out.println("�ν��Ͻ� �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ�");}
	static void outTest2() {System.out.println("�ν��Ͻ� �ܺ� Ŭ������ ���� �޼ҵ�");}
	public void usingClass() {inclass.intest();}
	
	class InClass{		//���� Ŭ����
						//�ܺ� Ŭ������ �����ڸ� �����ؾ� ȣ�� ����
		int innum = 100;
		//static int sinnum = 200; //�ν��Ͻ� ���� Ŭ���������� ���� ������ ����� �� ����.
									//(Ŭ���� �տ� static ���̸� ��� ����)
		
		void intest() {
			System.out.println("OutClass num = "+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass snum = "+snum+"(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass innum = "+innum+"(���� Ŭ������ �ν��Ͻ� ����)");}
		
		//static void stest() {} �ν��Ͻ� ���� Ŭ���������� ���� �޼ҵ� ��� �Ұ�!
		
		public void usingClass() {inclass.intest();}
		
	}
	
	static class sInClass {	//���� ���� Ŭ����
							//�ν��Ͻ� ����,�޼ҵ�� ���� ����,�޼ҵ� ��� ��� ����
							//�ܺ� Ŭ������ �����ڸ� �������� �ʾƵ� ȣ�� ����
		int innum = 100;
		static int sinnum = 200;
		
		void sintest() {
			//num += 10;  //�ܺ� Ŭ������ �ν��Ͻ� ���� ��� �Ұ�
			System.out.println("OutClass snum = "+snum+"(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("sInClass sinnum = "+sinnum+"(���� Ŭ������ ����ƽ ����");
			System.out.println("sInClass innum = "+innum+"(���� Ŭ������ �ν��Ͻ� ����)");}
		
		static void sinstest() {
			//num += 10;
			//innum += 10;
			System.out.println("OutClass snum"+snum+"(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("sInClass sinum"+sinnum+"(���� Ŭ������ ����ƽ ����");}
			
	}
	
}


public class InerClassTest {

	public static void main(String[] args) {
		
		OutClass oclass = new OutClass();	//�ܺ� Ŭ���� ��ü ����
		System.out.println("�ܺ� Ŭ���� ȣ���Ͽ� ���� Ŭ���� ��� ȣ��");
		oclass.usingClass();
		System.out.println();
		
		OutClass.InClass iclass = oclass.new InClass();		//���� Ŭ���� ��ü ����
		System.out.println("�ܺ� Ŭ���� ������ ����Ͽ� ���� Ŭ���� ��ü ����");
		iclass.intest();
		System.out.println();
		
		OutClass.sInClass sinclass = new OutClass.sInClass();
		System.out.println("���� ���� Ŭ������ �ν��Ͻ� �޼ҵ� ȣ��");
		sinclass.sintest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.sInClass.sinstest();
		
		
	}////main
}/////class
