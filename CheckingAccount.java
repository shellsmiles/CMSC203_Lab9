
public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;

	
	public CheckingAccount (String name, double amount) {
		super(name, amount);
		//accountNumber= super.getAccountNumber() + "-"+ 10;
		super.setAccountNumber( super.getAccountNumber() + "-"+ 10);
	}
	
	public boolean withdraw(double amount)
	{
		double withdraw= amount+FEE;
		return super.withdraw(withdraw);
	}
	
	
	
	
	
	
	
	
	
	
}
