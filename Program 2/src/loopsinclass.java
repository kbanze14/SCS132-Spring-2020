//kevin banze
//in class loops
//Feb 18

public class loopsinclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfPickles = 15;
		
		while(numberOfPickles > 0) {
			System.out.println("That pickle was delicious.");
			//System.out.println("You have " + numberOfPickles + " pickles left."); have to subtract pickles first 
			//thats why this is copy and pasted below
			numberOfPickles--;
			//or --numberOfPickles;
			//or numberOfPickles = numberOfPickles - 1;
			System.out.println("You have " + numberOfPickles + " pickles left.");
			
		}
			
		int concertTickets = 4;
		//reduce the number of tickets 2 every time you attend a concert
		do 
		{
				
			
			concertTickets--;
			concertTickets--;
			System.out.println("That is a great concert.");
			System.out.println("Too bad I only have " + concertTickets + " tickets left.");
		} while(concertTickets > 0);
		
		
		
		// we do not need to initialize age in advance
		// int age = 0;
		
		//loop and count up until the user can drive
		//assign age, test the age, every time it runs add a year
		for(int age = 0; age <=18; age++)
		{
			System.out.println("You are " + age + " years old.");
			if (age < 16)
			System.out.println("You are NOT old enough to drive.");
			//age++ we dont want this becasue we already did it in the for 
			// if we do put this here, it will skip 2 years instead of 1
			else
			{
			if (age == 16)
				System.out.println("Good luck on your test!");
			if (age == 18)
			{
				System.out.println("You can now vote.");
				System.out.println("You are now an adult.");
			}
			}
			
			
		}
		
			
		}
		
		
	}


