package object06.singleton;

public class Company {
	//�̱��� : Ŭ�������� �� �ϳ��� ��ü�� �����ϵ��� ������ ������ ����
	
		private static Company instance = new Company();
		
		
		private Company() {} //�ܺ� Ŭ�������� �����ڸ� ȣ�� ���ϵ��� ����
		
		public static Company getInstance() {//�ܺο��� ��ü�� ������ ��, �޼ҵ带 ȣ���ؼ�
											 //��ü�� �����ǵ���(����) ����
				 							 //�ܺο��� ��ü �������� Ŭ�����̸����� ȣ�� ����
			return instance;}
}
