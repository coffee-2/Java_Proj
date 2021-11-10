package exception_10.custom_Exception;

public class IDFormatTest {

	private String id; //id에 null 값을 넣을 경우 사용자 정의 Exception 발생
	public String getID() {return id;}
	public void setID(String id) throws IDFormatException {
		if(id==null) {throw new IDFormatException("아이디를 입력하세요");}
		else if(id.length()<8 || id.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 만들어야 합니다.");}
		else {System.out.println("아이디가 생성되었습니다 "+"(ID : "+id+")");}
		this.id = id;}
	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String id = null;
		try {test.setID(id);}
		catch(IDFormatException e) {System.out.println(e.getMessage());}
		
		id = "1234567";
		try {test.setID(id);}
		catch(IDFormatException e) {System.out.println(e.getMessage());}
		
		id = "12346578";
		try {test.setID(id);}
		catch(IDFormatException e) {System.out.println(e.getMessage());}
		
		
	}/////main
}/////////class
