package com.java.programs;

import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		
		int rows = 8;
		int rightrows = rows - 1;
		
		//pyramid
		for(int i = 0; i < rows; i++) {
			//this creates the spaces on the left
			for(int j = rows - i; j >=0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//right-leaning triangle
		for(int i = 0; i <= rightrows; i++) {
			for(int j =rightrows-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();

		//downward triangle
		for(int i = 0; i < rows; i++) {
			for(int j = i; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int j = (rows-i)-1; j>=0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	
}




