//Kevin Banze
//SCS 132
//February 20
//kbanze14

package program3;
//importing scanner
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// turning scanner on
		Scanner keyboard = new Scanner(System.in);
		
		//declaring variables
		int number;
		String Name;
		
		//asking for name and number
		System.out.println("What is your name?");
		Name = keyboard.next();
		
		// creating a do while loop
		// asking for number in loop to remove asking for a variable twice
		 do {
		System.out.println("Please type in a valid number from 0-100 " + Name);
		number = keyboard.nextInt();
		
		//looking for false info so the loop will continue if given
		}while(number < 0 || number > 100);
		 System.out.println("Thank you for your input " + Name + ".");
			 
		 //creating for loop and declaring new variable that is able to change 
		 //while keeping original variable in tact
		 // numberTemp vs number
		for (int numberTemp = number; numberTemp > 0; numberTemp--)
		{
			System.out.println(numberTemp + " seconds until liftoff.");
			
			//creating the countdown 
			if(numberTemp <= 1)
				System.out.println("Blast off.");
			
		}
			 
				
}
}
		
		
		


