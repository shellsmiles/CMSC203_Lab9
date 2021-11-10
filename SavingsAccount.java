
public class SavingsAccount extends BankAccount
{
	//1
	private double rate= 0.025;
	private int savingsNumber= 0;
	private String accountNumber;
	
	//2
	public SavingsAccount (String name, int balance) 
	{
		super(name, balance);
		accountNumber= super.getAccountNumber()+ "-"+savingsNumber;
	}
	
	//3
	public void postInterest() 
	{
		super.deposit ( super.getBalance() * rate/12 );
	}
	
	//4
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	//5
	public SavingsAccount(SavingsAccount originalSavings, int balance) 
	{
		super(originalSavings, balance);
		savingsNumber += 1;
		accountNumber = super.getAccountNumber()+ "-"+ savingsNumber;
	}
}
