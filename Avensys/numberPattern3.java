package com.java.programs;

public class numberPattern3 {

	public static void main(String[] args) {
		int n = 5;
		int rows = 5;
		for(int i = 0; i<= rows; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(n);
				n -=1;
			}
			n = 5;
			if(i != rows) {
				System.out.println();
			}	
		}
		
		System.out.println();

		for(int i = 0; i<= rows; i++) {
			

			for(int j = 0; j < i; j++) {
				if(j%2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			
			System.out.println();
		}

	}
}


