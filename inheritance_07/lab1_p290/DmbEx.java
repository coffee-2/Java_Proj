package inheritance_07.lab1_p290;

public class DmbEx {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("프나폰", "하얀색", 9);
		
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		System.out.println("채널 : " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("플로버 뭐해~~? 오늘 술마실래?!");
		dmb.sendVoice("좋지ㅋㅋㅋㅋ 어디서?");
		dmb.receiveVoice("나 지금 문래역이야 문래로 와~");
		dmb.sendVoice("알았어ㅋㅋㅋ 도착하면 전화할게");
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.change(10);
		dmb.turnOffDmb();
		
		
	}////main
}///////class
