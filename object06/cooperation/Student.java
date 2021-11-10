package object06.cooperation;

public class Student {
	public String name;  //학생이름
	public String grade; //학년
	public int money;    //가진 돈
	
	public Student(String name, String grade, int money) {//학생이름과 가진 돈을 초기화
		this.name = name;
		this.grade = grade;
		this.money = money;}
	
	public void takeBus (Bus bus) {//버스를 탔을 때
		bus.take(1000); //버스 money에 1000 추가
		this.money -= 1000;}
	
	public void takeSubway (Subway subway) {//지하철을 탔을 때
		subway.take(1500); //지하철 money에 1500 추가
		this.money -= 1500;}
		
	public void showInfo() {
		System.out.println(name + grade + "님의 남은 돈은 " + money + "원 입니다.");}
	
	
	
}/////class