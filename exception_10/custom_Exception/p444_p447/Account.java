package exception_10.custom_Exception.p444_p447;

public class Account {
	private long balance;
	public Account() {}
	
	public long getBalance() {return balance;}
	
	public void deposit(int money) {
		balance += money;
		System.out.println("예금 "+money+"원이 확인되었습니다.\r\n"
					+"(잔액 : "+balance+"원)");}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance<money) {throw new BalanceInsufficientException("잔고부족 : "+
						(money-balance)+"원 모자람");}
		balance -= money;}
	
	/*
	if(balance<money) {System.out.println("잔액이 부족합니다. ("
			+(money-balance)+"원 부족)\r\n"+"(잔액 : "+balance+"원)");}
	else {
		balance -= money;
		System.out.println("출금 "+money+"원이 확인되었습니다.\r\n"
					+"(잔액 : "+balance+"원)");}	
	*/
}
