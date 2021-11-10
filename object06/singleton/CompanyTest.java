package object06.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		//Company mycom1 = new Company(); //Company() 생성자가 private으로 설정
										//외부에서 호출 불가
		//Company mycom2 = new Company();
		
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		if(myCom1 == myCom2) {
			System.out.println("같은 회사 입니다.");}
		else System.out.println("다른 회사 입니다.");
		
		System.out.println(myCom1);
		System.out.println(myCom2);
		
	}///main
}
