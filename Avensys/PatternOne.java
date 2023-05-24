package com.java.programs;

import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows?");
		int rows = scanner.nextInt();
		
		
		

		//nested for loop one for rows, one for columns
		//nested for loop one for rows, one for columns
		/*
		for(int i = 0; i <= rows; i++) {	
			for(int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i = 0; i <= rows; i++) {	
			for(int j = i; j>=0; j--) {
				System.out.print("*");
			}
			for(int j = 0; j<= columns; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		*/
		
		//hollowed square
		
		for(int j=0; j <= rows; j++) {
			for(int i=0; i<= rows; i++) {
				/*
				if(i==0 || j == 0 || i == rows|| j == rows) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				*/					
				if(i>0 && j > 0 && i < rows && j < rows) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	} 
	
	
	
}





