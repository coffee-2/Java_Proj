package basic_class_11.object;

import java.util.Objects;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;}
	

	public void setDay(int day) {this.day = day;}
	public void setMonth(int month) {this.month = month;}
	public void setYear(int year) {this.year = year;}


	@Override
	public int hashCode() {return Objects.hash(day, month, year);}
								//Objects.hash() = hashCode를 생성해줌
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(year==md.year && month==md.month && day==md.day) {return true;}
			else {return false;}
		}
		return false;}

	@Override
	public String toString() {return year+"년 "+month+"월 "+day+"일 입니다.";}
	
	
}


public class EqualTest4 {

	public static void main(String[] args) {
		
		MyDate md1 = new MyDate(27, 9, 2021);
		MyDate md2 = new MyDate(27, 9, 2021);
		MyDate md3 = new MyDate(15, 10, 1996);
		MyDate md4 = new MyDate(24, 9, 1996);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		System.out.println(md4);
		System.out.println("====================");
		System.out.println(md1.equals(md2));
		System.out.println(md1.equals(md3));
		System.out.println(md3.equals(md4));
		System.out.println("====================");
		System.out.println(md1.hashCode());
		System.out.println(md2.hashCode());
		System.out.println(md3.hashCode());
		System.out.println(md4.hashCode());
		System.out.println("====================");
		System.out.println(System.identityHashCode(md1));
		System.out.println(System.identityHashCode(md2));
		System.out.println(System.identityHashCode(md3));
		System.out.println(System.identityHashCode(md4));
		
		
		
	}///main
}/////class
