// topic 3 scanners
//2/6/2020

import java.util.Scanner;
public class topic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//start scanner
		Scanner keyboard = new Scanner (System.in);
		
//declare variables
		String firstName = "Kevin";
		String lastName;
		int age;
		
//collect user input 
		System.out.print("What is your last name? ");
		lastName = keyboard.next();
		System.out.print("What is your age? " );
		age = keyboard.nextInt();
		
		//turn keyboard off (optional)
		//keyboard.close();
		
//output results
		System.out.println(firstName + " " + lastName + " is " + age + " years old.");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
	}

}
