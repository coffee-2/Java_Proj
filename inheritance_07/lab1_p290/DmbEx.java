package inheritance_07.lab1_p290;

public class DmbEx {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("覗蟹肉", "馬鍾事", 9);
		
		System.out.println("乞季 : " + dmb.model);
		System.out.println("事雌 : " + dmb.color);
		System.out.println("辰確 : " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("食左室推");
		dmb.receiveVoice("巴稽獄 更背~~? 神潅 綬原叔掘?!");
		dmb.sendVoice("疏走せせせせ 嬢巨辞?");
		dmb.receiveVoice("蟹 走榎 庚掘蝕戚醤 庚掘稽 人~");
		dmb.sendVoice("硝紹嬢せせせ 亀鐸馬檎 穿鉢拝惟");
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.change(10);
		dmb.turnOffDmb();
		
		
	}////main
}///////class
