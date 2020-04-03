//kevin banzd
//programming 1
//Arrays
package program6;
//import keyboard and rng
import java.util.Scanner;
import java.util.Random;
public class banzepro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explain game
		System.out.println("Paper Airplane Toss\t");
		System.out.println("Each team selects a number of players, with a max of 10, and each player on a team throws a paper airplane.");
		System.out.println("The team with the highest total number of distance traveled wins.");
		//declare vars
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		int teamOneTotal = 0;
		int teamTwoTotal = 0;
		String teamOne = "Team One:\t";
		String teamTwo = "Team Two:\t";

		//ask user for # of sectins
		System.out.println("How many players will be throwing?");
		int sections = keyboard.nextInt();

		//create the array
		int[][] scores = new int[2][sections];

		//LOOP ONE: colums first
		for(int row = 0; row < scores[0].length; row++)
		{
			//Loop two
			for(int col = 0; col < scores.length; col++)
			{
				//random info for team one
				if(col == 0) {
					//random
					scores[col][row] = randomNumber.nextInt(100);
					//total
					teamOneTotal += scores[col][row];
					//add to string
					teamOne = teamOne + scores[col][row] + "\t";
				}
				if(col == 1) {
					//random for team two
					scores[col][row] = randomNumber.nextInt(100);
					//total
					teamTwoTotal += scores[col][row];
					//add to string
					teamTwo = teamTwo + scores[col][row] + "\t";
				}
			}//end of loop two
		}//end of loop one

		//output tptal scores
		System.out.println(teamOne + "=\t" + teamOneTotal);
		System.out.println(teamTwo + "=\t" + teamTwoTotal);
		if(teamOneTotal == teamTwoTotal) {
			System.out.println("There was a tie");

		}
		if(teamOneTotal>teamTwoTotal) {
			System.out.println("Team One is the Winner!");
			}
		if(teamOneTotal<teamTwoTotal) {
			System.out.println("Team Two is the Winner!");
		}
	}

}
