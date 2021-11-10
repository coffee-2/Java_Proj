package inheritance_07.abstract_gamelevel;

public class PlayerEx {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.play(1);
		
		AdvancedLv Alv = new AdvancedLv();
		p1.uplv(Alv);
		p1.play(2);
		
		MasterLv Mlv = new MasterLv();
		p1.uplv(Mlv);
		p1.play(3);
		
		
	}//////main
}///////////class
