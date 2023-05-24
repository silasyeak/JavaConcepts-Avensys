package com.java.programs;

public class letterPattern2 {

	public static void main(String[] args) {
		int alpha = 69;
		for(int i = 0; i <=4; i++) {
			for(int j = 0; j <= i; j++) {
				//System.out.print(Character.toString(alpha));
				System.out.print((char) alpha);
				alpha -= 1;
			}
			alpha = 69;
			System.out.println();

		}

		System.out.println();
		
		int alpha3 = 65;
		for(int i = 0; i <5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 4; j>=i; j--) {
				System.out.print((char)(j + alpha3 -i));
			}
			System.out.println();
		}  
		System.out.println();
		
		
		int alpha2 = 65;

		
		int rowsTwo = 5, k = 0;

	    for (int i = 1; i <= rowsTwo; ++i, k = 0) {
	      for (int space = 1; space <= rowsTwo - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print((char) alpha2 + " ");
	        alpha2 +=1;
	        k++;
	        
	      }
	      alpha2 = 65;

	      System.out.println();
	    }
	    
		/*
		 * int rows = 10;
		//pyramid
		for(int i = 0; i < rows; i+=2) {
			//this creates the spaces on the left
			for(int j = rows - i; j >=0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) {
				System.out.print((char) alpha2 + " ");
				alpha2 +=1;
			}
			alpha2 = 65;
			System.out.println();
		}
		System.out.println();
		*/
	}

}

