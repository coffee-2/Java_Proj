package object06.static_ex;

public class Member {
	String name;
	String ID;
	String password;
	int age;
	
	public void name(String name) {
		 this.name = name;}
	public void ID(String ID) {
		this.ID = ID;}
	public void password(String password) {
		this.password = password;}
	public void age(int age) {
		this.age = age;}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
