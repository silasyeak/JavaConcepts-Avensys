package com.java.programs;

import java.util.Scanner;

public class keyNotFound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("length of array?:");
		int len = scan.nextInt();
		int a[] = new int[len];
		System.out.println("Array is created w/the size of " + len);
		System.out.println("Enter the elements:");
		for(int i = 0; i <= a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("What is the key?");
		int key = scan.nextInt();
		
		boolean BoolCheck = false;
		for(int i = 0; i <= a.length - 1; i++) {
			if(a[i] == key) {
				BoolCheck = true;
				System.out.print("key found at index: ");
				System.out.print(i + " --> " + a[i]);
				
			}
			
		}
		if(BoolCheck == false) {
			System.out.print("key not found!");
		}

	}

}
