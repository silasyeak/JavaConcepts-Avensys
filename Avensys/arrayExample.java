package com.java.programs;

import java.util.Scanner;

public class arrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[5];
//		for(int i = 0; i <=4; i++) {
//			System.out.println("Please enter the " + (i+1) + "th student marks");
//			a[i] = scan.nextInt();
//		}
		int i = 0;
		
		//do while loop used to make sure the first iteration is tried
		
		do {
			System.out.println("Please enter the " + (i+1) + "th student marks");
			a[i] = scan.nextInt();
			i++;
		} while (i<= a.length-1);
		
		
		int j = 0;
		do {
			System.out.println((j+1) + "th Students marks are: " + a[j]);
			j++;
		} while (j <= a.length -1);
		
		
//		System.out.println("Stored marks are present below:");
//		for(int j = 0; j <=4; j++) {
//			System.out.println((j+1) + "th Students marks are: " + a[j]);
//		}

	}

}
