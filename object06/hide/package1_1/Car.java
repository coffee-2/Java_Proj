package object06.hide.package1_1;

public class Car {
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() {
		return speed;}
	public void setSpeed(int speed) {
		if(speed <=5) {
			this.speed = 0;
			return;}
		else {this.speed = speed;}
	}
	
	public boolean isStop() {
		return stop;}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
}////class
