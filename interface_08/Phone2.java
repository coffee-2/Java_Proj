package interface_08;

public interface Phone2 {
	int timeout = 10000; //public static final ���� ����
	void sendcall();	 //public abstract
	void receivecall();	 //public abstract
	default void printLogo() {System.out.println(" �ΰ� ");} //public
}
