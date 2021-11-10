package collection;

public class Member implements Comparable<Member> {
	
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Override
	public String toString() {return name + " ȸ������ ���̵�� " + id + " �Դϴ�.";}
	
	
	public String equalss(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id==member.id) {return "������ ȸ���Դϴ�.";}
			else {return "�ٸ� ȸ���Դϴ�.";}
		}
		return "ȸ�� ������ ã�� �� �����ϴ�.";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id==member.id) {return true;}
			else {return false;}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {return id;}
	
	public int compareTo(Member member) {
		// return (this.id - member.id);			//�������� ����
		 return (this.id - member.id) * (-1); //�������� ����
	}
	
	
}
