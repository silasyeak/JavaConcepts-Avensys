package com.java.programs;

public class numberPattern {

	public static void main(String[] args) {
		
		/*
		for(int i = rows; i>= 0; i--) {
			for(int j = i; j<=4; j++) {
				System.out.print(count + " ");
				count += 1;
			}
			count = 1;
			if(i != rows) {
				System.out.println();
			}	
		}
		 */
		/*
		for(int i = 0; i <=rows; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(count + " ");
				count += 1;
			}
			count = 1;
			System.out.println();
		}
		*/ 
		int count = 1;
		int rows = 3;
		for(int i=0; i<= rows; i++) {
			for (int j= rows; j >= i; j--) {	
					System.out.print(count+ " ");
					count += 1;
				}
				count = 1;
				System.out.println();
				
		}
		int n = 10;
		System.out.println();
		for(int i = 0; i<= rows; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(n+ " ");
				n--;
			}
			System.out.println();
		}
	
	}
}














