package object06.final_ex;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;}
	
	//static final : 모든 객체에서 참조할 경우, 객체 내부에 상수를 로드하지 않고
	//				 stack영역에 저장해 모든 객체들이 공유해 사용하도록 설정
}
