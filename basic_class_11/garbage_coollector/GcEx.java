package basic_class_11.garbage_coollector;

class Employee {
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee ("+eno+") �� �޸𸮿� ������");}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee ("+eno+") �� �޸𸮿��� ������");}
	
}


public class GcEx {

	public static void main(String[] args) {
		Employee em;
		em = new Employee(1);
		em = null;
		em = new Employee(2);
		em = new Employee(3);
		
		System.out.println("em�� ���������� �����ϴ� �����ȣ : "+em.eno);
		System.gc();
		
		
	}////main
}///////class
