package com.java.programs;

import java.util.Random;
import java.util.Scanner;

public class dynamicArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("length of array");
		int len = scan.nextInt();
		int a[] = new int[len];
		System.out.println("Array is created w/the size of " + len);
		System.out.println("Enter the elements");
		for(int i = 0; i <= a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("1st Array elements are");
		
		for(int j = 0; j <= a.length - 1; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		
		int b[] = new int[a.length];
		for(int i = 0; i <= a.length - 1; i++) {
			b[i] = a[len - i -1];
		}
		int k = a.length -1;
		int c[] = new int[a.length];
		for(int i = 0; i <= a.length - 1; i++) {
			c[k] = a[i];
			k--;
		}
		System.out.println("2nd Array elements are");
		for(int j = 0; j <= a.length - 1; j++) {
			System.out.print(b[j] + " ");
			
		}
		System.out.println();
		System.out.println("3rd Array elements are");
		for(int j = 0; j<=a.length -1; j++) {
			System.out.print(c[j] + " ");
		}
		
		

	}

}
