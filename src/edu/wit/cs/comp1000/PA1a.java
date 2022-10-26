package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int yards;
	int feet;
	int inches;
	
	System.out.printf("Enter number of yards: ");
	yards = input.nextInt(); 
	
	
	System.out.printf("Enter number of feet: ");
	feet = input.nextInt();	
	
	
	System.out.printf("Enter number of inches: ");
	inches = input.nextInt();
	
	
	int ans;
	ans = feet*12+yards*36+inches;
	    System.out.printf("Total number of inches: ");
    System.out.print(ans);

	}

}
