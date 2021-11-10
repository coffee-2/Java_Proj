package collection;

public class Member2 implements Comparable<Member2> {
	
	private int id;
	private String name;
	
	public Member2(int id, String name) {
		this.id = id;
		this.name = name;}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Override
	public String toString() {return name + " 회원님의 아이디는 " + id + "입니다.";}
	
	
	public String equalss(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.id==member.id) {return "동일한 회원입니다.";}
			else {return "다른 회원입니다.";}
		}
		return "회원 정보를 찾을 수 없습니다.";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.id==member.id) {return true;}
			else {return false;}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {return id;}

	@Override
	public int compareTo(Member2 member2) {
		return (this.id - member2.id);
	}

	
}
