// Kevin Banze
// Programming 1
// February 11 2020
// kbanze14

	//importing scanner
	import java.util.Scanner;
public class Program2Banze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//turning on scanner
		Scanner keyboard = new Scanner (System.in);
		
		//Declaring variables
		int number1;
		int number2;
		int number3;
		
		
		//asking for variables
		System.out.println("What is your favorite number? ");
		number1 = keyboard.nextInt();
		System.out.println("What is your second favorite number? ");
		number2 = keyboard.nextInt();
		System.out.println("What is your third favorite number? ");
		number3 = keyboard.nextInt();
		
		// Main Menu display
		System.out.println("Program 2 Menu");
		System.out.println("\t1.) Add  " + number1 + " and " + number2 );
		System.out.println("\t2.) Subtract " + number2 + " from  " + number1 );
		System.out.println("\t3.) Multiply " + number1 + " and " + number2 );
		System.out.println("\t4.) Add " + number2 + " and itself");
		System.out.println("\t5.) Exit");
		System.out.println("\tSelect an option please");
		
		
		//creating switch and variable for menuchoice
		int menuChoice = keyboard.nextInt();
		
		switch (menuChoice) {
			case 1:
				System.out.print( number1 + number2 ); //i think this is the easiest way to do this but if there is an easier way please let me know
				if ( number1 + number2 > number3)
					System.out.println(" is greater than " + number3); 
				else 
					System.out.println(" is less than " + number3);			
				break;
			case 2:
				System.out.print( number2 - number1 );
				if ( number2 - number1 > number3)
					System.out.println(" is greater than " + number3); 
				else 
					System.out.println(" is less than " + number3);			
				break;
			case 3:
				System.out.print( number1 * number2 );
				if ( number1 * number2 > number3)
					System.out.println(" is greater than " + number3); 
				else 
					System.out.println(" is less than " + number3);			
				break;
			case 4:
				System.out.print( number2 + number2);
				if ( number2 + number2 > number3)
					System.out.println(" is greater than " + number3); 
				else 
					System.out.println(" is less than " + number3);			
				break;
			default:
				System.out.println("Program 2 Complete");
				
				
			
				
		}
		
				
		
		
		
		
		
				
		
		
		
				
	}

}
