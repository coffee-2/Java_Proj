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
	public String toString() {return name + " 회원님의 아이디는 " + id + " 입니다.";}
	
	
	public String equalss(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id==member.id) {return "동일한 회원입니다.";}
			else {return "다른 회원입니다.";}
		}
		return "회원 정보를 찾을 수 없습니다.";
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
		// return (this.id - member.id);			//오름차순 정렬
		 return (this.id - member.id) * (-1); //내림차순 정렬
	}
	
	
}
