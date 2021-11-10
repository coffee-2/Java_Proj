package basic_class_11.garbage_coollector;

class Employee {
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee ("+eno+") 가 메모리에 생성됨");}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee ("+eno+") 가 메모리에서 삭제됨");}
	
}


public class GcEx {

	public static void main(String[] args) {
		Employee em;
		em = new Employee(1);
		em = null;
		em = new Employee(2);
		em = new Employee(3);
		
		System.out.println("em이 최종적으로 참조하는 사원번호 : "+em.eno);
		System.gc();
		
		
	}////main
}///////class
