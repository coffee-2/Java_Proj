package object06.static_ex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 Lee = new Student3();
		Lee.name = "ÀÌÀç¸í";
		System.out.println(Student3.getserialNum());
		System.out.println();
		
		Student3 Yun = new Student3();
		Yun.name = "À±¼®¿­";
		System.out.println(Student3.getserialNum());
		System.out.println();
		
		Student3 Hong = new Student3();
		Hong.name = "È«ÁØÇ¥";
		System.out.println(Student3.getserialNum());
		System.out.println();
	}////main
}
