package basic_class_11.class_ex;

public class NewinstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException {
		Person p1 = new Person();	//new를 사용해서 객체 생성
		System.out.println(p1);
		
		Class pClass = Class.forName("basic_class_11.class_ex.Person");
		
		Person p2 = (Person)pClass.newInstance();  
			//newInstance() : *.class파일로 객체 생성
		System.out.println(p2);		
		
		
	}////main
}///////class
