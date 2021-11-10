package Practice.Fruit_;

public class Fruit {
	String name;
	String color;
	int size;
	
	public Fruit() {}
	
	public Fruit(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;}
	
	public String showInfo() {
		return "과일의 내용을 출력합니다.";}
	
}
