package com.java.programs;
import java.util.*;

public class multipleArrayPractice {

	public static void main(String[] args) {
		int a[][] = new int[5][3];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= a.length - 1; i++) {
			for(int j = 0; j <= a[i].length - 1; j++) {
				System.out.println("Enter the amount of money of bank " + (i+1) + " customer " + (j+1));
				a[i][j] = input.nextInt();		
			}
		}

		for(int i = 0; i <= a.length - 1; i++) {
			for(int j = 0; j <= a[i].length - 1; j++) {
//				System.out.println("The amount of money in bank " + (i+1) + ", Customer "+ (j+1) +" is " + a[i][j]);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
