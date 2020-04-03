//kevin banze
//bank account class
//march 24
public class BankAccount {

	//declare var
	public String name;
	private double balance;
	public char type;
	public double intRate;
	public int accountNumber;
	
	//build constructor (same name as class BankAccount)
	//constructor is OPTIONAL********************
	public BankAccount()
	{
		//set initial balance of account
		balance = 0;
		intRate = .02;
	}
	//deposit funds
	public void addDeposit(double dep) {
		
		balance = balance + dep;
	}
	
	//withdraw
	public void subWithdraw(double wit) {
		if (balance < wit)
		{
			System.out.println("You do not have enough funds to withdrawl that amount.");
		}
		else {
			balance = balance - wit;
		}
		
	}
	
	//check balance
	public double getBalance() {
		return balance;
	}
	//calc intereat
	public void calcInterest() {
		//only calc for IB and S
		if (type == 'S' || type == 'I')
			//double intAmount
			//interestAmount = balnce + intrate
			//balnce += intamount
			balance = balance + (1+intRate);   //mulitply times 1.02
	}
	
	
}
