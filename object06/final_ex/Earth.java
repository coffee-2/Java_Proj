package object06.final_ex;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;}
	
	//static final : ��� ��ü���� ������ ���, ��ü ���ο� ����� �ε����� �ʰ�
	//				 stack������ ������ ��� ��ü���� ������ ����ϵ��� ����
}
