//Kevin Banze
//SCS 132 Final
//April 24, 2020


//import random,scanner, and io
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class banzefinal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Declaring variables
		double betAmount = 0;
		double winnings=0;
		double balance = 100;

		//creating the array 
		int[][] slotBoard = new int [3][3];
		//making the variables that will store the values of the array
		int a, b, c, e, f, g, x, y, z;
		Scanner keyboard = new Scanner(System.in);
		int play;
		//creating the file to write to OUTSIDE OF THE LOOP
		FileWriter fw = new FileWriter("/Users/kevinbanze/Desktop/slotRolls.txt" ,false);
		PrintWriter outputFile = new PrintWriter(fw);

		//enclosing the program in the loop to make it repeat 
		do {

			//asking user for input on playing and the bet
			System.out.println("Would you like to roll the slot machine?\t1 for yes 2 for no");

			//creating the switch that will fuel the loop
			play = keyboard.nextInt();
			switch(play) {
			case 1:
				System.out.println("How much would you like to bet?");
				betAmount = keyboard.nextDouble();
				break;
			case 2:
				System.out.println("Have a good day.");
				System.exit(0);
				break;
			}
			//methods used to populate and print the arrays
			slotBoard = slotPopulate();
			slotPrint(slotBoard);

			//storing the values of the array 
			a = slotBoard[0][0];
			b = slotBoard[1][0];
			c = slotBoard[2][0];
			// importnat variables***** e f g
			e = slotBoard[0][1];
			f = slotBoard[1][1];
			g = slotBoard[2][1];

			x = slotBoard[0][2];
			y = slotBoard[1][2];
			z = slotBoard[2][2];

			//outputting the values of the array to a file
			//so you can keep track of the rolls of the game you played
			outputFile.println(a +"\t" + b +"\t" + c);
			outputFile.println(e +"\t" + f +"\t" + g);
			outputFile.println(x +"\t" + y +"\t" + z);
			outputFile.println("==================");
			//thank you google
			//only way the print statements would go through is with the flush command
			outputFile.flush();


			//Determining winning conditions
			if(e == f && f == g) {
				winnings = e*betAmount;
				System.out.println("WINNER!!!! You won " + winnings);
				balance= balance + winnings;
				System.out.println("Your balance is " + balance);

			}
			else {
				balance= balance - betAmount;
				System.out.println("You lost. You have " + balance + " credits left."); 

			}
			//if you have zero credits, game is over
			if(balance<1) {
				System.out.println("You do not have any credits left to play.");
				System.exit(0);
			}
		}
		//do while loop because its post test, the program needs to be ran at least one time
		while(play==1);

		//closing the outout file
		outputFile.close();




	}
	//methods for populating slotBoard, still confusing but evetually worked it out
	//still a bit confused on what to return and when it is ideal to use methods
	public static int[][] slotPopulate() {
		Random random = new Random();
		int slotBoard[][] = new int[3][3];
		for(int row=0;row<3;row++) {

			for(int col=0;col<3;col++) {
				if(col==0) {
					slotBoard[col][row] = random.nextInt(5) + 1;
				}
				if(col==1) {
					slotBoard[col][row] = random.nextInt(5) + 1;
				}
				if(col==2) {
					slotBoard[col][row] = random.nextInt(5) + 1;
				}
			}
		}
		return slotBoard;

	}
	//method for printing out the slotboard, same as the other method
	public static void slotPrint(int[][] slotBoard ) {
		System.out.println(slotBoard[0][0] + "\t" + slotBoard[1][0] + "\t" + slotBoard[2][0]);
		System.out.println(slotBoard[0][1] + "\t" + slotBoard[1][1] + "\t" + slotBoard[2][1]);
		System.out.println(slotBoard[0][2] + "\t" + slotBoard[1][2] + "\t" + slotBoard[2][2]);
	}
}
