package exception_10.custom_Exception.p444_p447;

public class AccountEx {

	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.deposit(10000);
		
		try {a1.withdraw(30000);} 
		catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();}
		
		
	}/////main
}//////////class
