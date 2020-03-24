//kevin banze
//march 24
//classes

import java.util.Scanner;
public class bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare var
		Scanner keyboard = new Scanner(System.in);
		double deposit= 0;
		double withdrawl = 0;
		
		//creaete checking account of BankAccount
		BankAccount checking = new BankAccount();
				//what this creates 
				//checking.main OR checking.accountnumber
		checking.name = "Kevin's Primary Checking.";
		checking.accountNumber = 233223;
		checking.type = 'C';
		
		//create a savings acc
		BankAccount savings = new BankAccount();
				savings.type = 'S';
		BankAccount IBchecking = new BankAccount();
		IBchecking.type = 'I';
		
		
		//lets set balance
		//checking.balance = 200.00
		//CANNOT DO THIS because balance is provate
		checking.addDeposit(200.00);
		System.out.println("Your starting balance is: $" + checking.getBalance());
		
		
		//make deposit
		System.out.println("How much do you want to deposit?");
		deposit = keyboard.nextDouble();
		checking.addDeposit(deposit);
		
		//make withdrawal
		System.out.println("How much do you want to withdrawal?");
		withdrawl = keyboard.nextDouble();
		checking.subWithdraw(withdrawl);
		
		//transfer funds from check to save
		checking.subWithdraw(50.00);
		savings.addDeposit(50.00);
		
		//calc interest
		IBchecking.calcInterest();
		checking.calcInterest();
		savings.calcInterest();
		
		//check balance
		System.out.println("Your final checkings balance is: $" + checking.getBalance());
		System.out.println("Your final savings balance is: $" + savings.getBalance());

		
		
	}

}
