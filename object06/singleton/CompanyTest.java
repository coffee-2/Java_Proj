package object06.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		//Company mycom1 = new Company(); //Company() �����ڰ� private���� ����
										//�ܺο��� ȣ�� �Ұ�
		//Company mycom2 = new Company();
		
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		if(myCom1 == myCom2) {
			System.out.println("���� ȸ�� �Դϴ�.");}
		else System.out.println("�ٸ� ȸ�� �Դϴ�.");
		
		System.out.println(myCom1);
		System.out.println(myCom2);
		
	}///main
}
