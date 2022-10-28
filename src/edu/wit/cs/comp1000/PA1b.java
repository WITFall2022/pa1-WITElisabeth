package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
Scanner input = new Scanner(System.in);
		
		int Totalinches; 
		System.out.printf("Enter number of inches: ");
		Totalinches = input.nextInt();
		
		int Yards;
		Yards = Totalinches/36;
		System.out.printf("Yards: %d%n",Yards);
		
		int Feet;
		Feet = Totalinches%36/12;
		System.out.printf("Feet: %d%n",Feet);
		
		int Inches;
		Inches = Totalinches%36%12;
		System.out.printf("Inches: %d%n",Inches);
	}

}
