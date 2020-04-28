//Kevin Banze
//SCS132
//Program 7
//April 28, 2020


//import scanner and io
import java.io.*;
import java.util.Scanner;
public class grades {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			//file to read from
			File filename = new File("/Users/kevinbanze/Desktop/grades.txt");
			Scanner inputFile = new Scanner(filename);

			//file to write to
			FileWriter fw = new FileWriter("/Users/kevinbanze/Desktop/output.txt", false);
			PrintWriter outputFile = new PrintWriter(fw);
			
			//variables needed in loop
			int gradesSum = 0;
			int totalGrades = 0;
			while(inputFile.hasNext()) {
				gradesSum+= inputFile.nextInt();
				totalGrades ++;
			}
			
			//variable for average of grades
			int gradeMed = gradesSum/totalGrades;
			
			//outputting information into output file
			outputFile.println("Grade Statistics");
			outputFile.println("================");
			outputFile.println("Total: " + gradesSum);
			outputFile.println("Number of Grades: " + totalGrades);
			outputFile.println("Average: " + gradeMed);

			//closing input and ouput files
			outputFile.close();
			inputFile.close();
			
			//exceptions
		}catch(EOFException error) {	//potentail error 1
			System.out.println("Sorry, i reached end of file.");
		}
		catch(FileNotFoundException error) {	//potentia; error 2
			System.out.println("Sorry, i cant find that file.");
			System.out.println("Error message: " + error.getMessage());

		}
		finally {
			System.out.println("finished");
		}
	}


}
