package exception_10.custom_Exception.p444_p447;

public class Account {
	private long balance;
	public Account() {}
	
	public long getBalance() {return balance;}
	
	public void deposit(int money) {
		balance += money;
		System.out.println("���� "+money+"���� Ȯ�εǾ����ϴ�.\r\n"
					+"(�ܾ� : "+balance+"��)");}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance<money) {throw new BalanceInsufficientException("�ܰ���� : "+
						(money-balance)+"�� ���ڶ�");}
		balance -= money;}
	
	/*
	if(balance<money) {System.out.println("�ܾ��� �����մϴ�. ("
			+(money-balance)+"�� ����)\r\n"+"(�ܾ� : "+balance+"��)");}
	else {
		balance -= money;
		System.out.println("��� "+money+"���� Ȯ�εǾ����ϴ�.\r\n"
					+"(�ܾ� : "+balance+"��)");}	
	*/
}
