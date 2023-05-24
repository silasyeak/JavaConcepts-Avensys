package com.java.programs;

public class numberPattern2 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = 1; i<= rows; i++) {
			int n = i;
			for(int j = 1; j <= i; j++) {
				
				System.out.print(n+ " ");
				n-=1;;
			}
			if(i != rows) {
				System.out.println();
			}
			
		}
		
		
		System.out.println("\n");
		for(int i = 1; i<= rows; i++) {
			int n = i;
			for(int j = 1; j <= i; j++) {
				System.out.print(n+ " ");
			}
			if(i != rows) {
				System.out.println();
			}
			
		}
	
	}

}
