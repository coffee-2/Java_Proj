package exception_10.custom_Exception;

public class IDFormatTest {

	private String id; //id�� null ���� ���� ��� ����� ���� Exception �߻�
	public String getID() {return id;}
	public void setID(String id) throws IDFormatException {
		if(id==null) {throw new IDFormatException("���̵� �Է��ϼ���");}
		else if(id.length()<8 || id.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������ �մϴ�.");}
		else {System.out.println("���̵� �����Ǿ����ϴ� "+"(ID : "+id+")");}
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
