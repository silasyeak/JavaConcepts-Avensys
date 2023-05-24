package com.java.programs;

import java.util.Scanner;

public class studentAge {

//	public static void main(String[] args) {
//		//I used byte for age, because people don't live pass 128 years old 
//		byte a[] = new byte[10];
//		Scanner input = new Scanner(System.in);
//		for(int i = 0; i <= a.length - 1; i ++) {
//			if(i == 0) {
//				System.out.println("Please enter the " + (i+1) + "st student's age");
//			}
//			else if (i == 1) {
//				System.out.println("Please enter the " + (i+1) + "nd student's age");
//			}
//			else if (i == 2) {
//				System.out.println("Please enter the " + (i+1) + "rd student's age");
//			}
//			else {
//				System.out.println("Please enter the " + (i+1) + "th student's age");
//			}
//			a[i] = input.nextByte();
//		}
//		
//		System.out.println("Stored marks are present below:");
//		for(int j = 0; j <= a.length - 1; j++) {
//			if(j == 0) {
//				System.out.println((j+1) + "st student's age is: " + a[j]);
//			}
//			else if (j == 1) {
//				System.out.println((j+1) + "nd student's age is: " + a[j]);
//			}
//			else if (j == 2) {
//				System.out.println((j+1) + "rd student's age is: " + a[j]);
//			}
//			else {
//				System.out.println((j+1) + "th student's age is: " + a[j]);
//			}
//			
//		}
//		
//	}
//	public static void main(String[] args) {
//		//I used byte for age, because people don't live pass 128 years old 
//		int a[] = new int[10];
//		Scanner input = new Scanner(System.in);
//		int i = 0;
//		while (i < a.length){
//			
//			if(i == 0) {
//				System.out.println("Please enter the " + (i+1) + "st student's age");
//			}
//			else if (i == 1) {
//				System.out.println("Please enter the " + (i+1) + "nd student's age");
//			}
//			else if (i == 2) {
//				System.out.println("Please enter the " + (i+1) + "rd student's age");
//			}
//			else {
//				System.out.println("Please enter the " + (i+1) + "th student's age");
//			}
//			a[i] = input.nextInt();
//			i++;
//		}
//		
//		System.out.println("Stored marks are present below:");
//		int j = 0;
//		while (j < a.length) {
//			if(j == 0) {
//				System.out.println((j+1) + "st student's age is: " + a[j]);
//			}
//			else if (j == 1) {
//				System.out.println((j+1) + "nd student's age is: " + a[j]);
//			}
//			else if (j == 2) {
//				System.out.println((j+1) + "rd student's age is: " + a[j]);
//			}
//			else {
//				System.out.println((j+1) + "th student's age is: " + a[j]);
//			}
//			j++;
//		}
//		
//
//	}
	public static void main(String[] args) {
		//I used byte for age, because people don't live pass 128 years old 
		int a[] = new int[10];
		Scanner input = new Scanner(System.in);
		int i = 0;
		do{
			
			if(i == 0) {
				System.out.println("Please enter the " + (i+1) + "st student's age");
			}
			else if (i == 1) {
				System.out.println("Please enter the " + (i+1) + "nd student's age");
			}
			else if (i == 2) {
				System.out.println("Please enter the " + (i+1) + "rd student's age");
			}
			else {
				System.out.println("Please enter the " + (i+1) + "th student's age");
			}
			a[i] = input.nextInt();
			i++;
		}while (i < a.length);
		
		System.out.println("Stored marks are present below:");
		int j = 0;
		do{
			if(j == 0) {
				System.out.println((j+1) + "st student's age is: " + a[j]);
			}
			else if (j == 1) {
				System.out.println((j+1) + "nd student's age is: " + a[j]);
			}
			else if (j == 2) {
				System.out.println((j+1) + "rd student's age is: " + a[j]);
			}
			else {
				System.out.println((j+1) + "th student's age is: " + a[j]);
			}
			j++;
		}while (j < a.length) ;
		

	}


}
