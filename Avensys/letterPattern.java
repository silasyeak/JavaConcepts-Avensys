package com.java.programs;

public class letterPattern {

	public static void main(String[] args) {
		int alpha = 65;
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				//System.out.print(Character.toString(alpha));
				System.out.print((char) alpha);
				alpha += 1;
			}
			alpha = 65;
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				//System.out.print(Character.toString(alpha));
				System.out.print((char) alpha);
			}
			alpha += 1;
			System.out.println();
			
		}
		System.out.println();
		
		//this is the equivalent of enumerating I think
		//he is incrementing both alphaInLoop and i at the same time
		for(int i = 0, alphaInLoop = 'a'; i <= 5; i++, alphaInLoop++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char)alphaInLoop);
			}
			
			System.out.println();
			
		}
		
		System.out.println();

		//this runs the for loop forever
		//the second portion will test the condition like an if-statement
		int z = 0;
		for(System.out.println("Hi"); z<= 3; System.out.println("world")) {
			System.out.println("Hello");
			z++;
		}
		
		System.out.println();
		alpha = 69;
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= i; j++) {
				//System.out.print(Character.toString(alpha));
				System.out.print((char) alpha);
			}
			
			System.out.println();
			alpha--;
			
		}
		
		System.out.println();
		
		alpha = 65;
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= i; j++) {
				//System.out.print(Character.toString(alpha));
				System.out.print((char) alpha);
			}
			alpha += 2;
			System.out.println();
			
		}
		
		System.out.println();
		
		//this is the equivalent of enumerating I think
		//he is incrementing both alphaInLoop and i at the same time
		alpha = 65;
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char) alpha);
				}
			if(alpha == 65) {
				alpha += 1;
			}
			else if (alpha == 66) {
				alpha -= 1;
				
			}
			
			System.out.println();
			
		}
		
	}
}













































