package inheritance_07.abstract_gamelevel;

public class Player {
	private Playerlevel lv;
	
	public Player() {
		lv = new BeginerLv();
		lv.showLVmeassge();}
	
	public Playerlevel getLv() {return lv;}
	
	public void uplv(Playerlevel lv) {this.lv = lv; lv.showLVmeassge();}//��ĳ����
	
	public void play(int count) {lv.go(count);}
	
}
