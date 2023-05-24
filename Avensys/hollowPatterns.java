package com.java.programs;

public class hollowPatterns {

	public static void main(String[] args) {
		//hollow pyramid
		System.out.println("hollow triangle:");
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j<=6; j++) {
				if((i+j== 3)|| (j-i == 3) ||(i == 3 && j% 2 == 0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();

		//hollow diamond
		System.out.println("hollow diamond:");
		for(int i = 0; i <=4; i++) {
			for(int j = 0; j <=4; j++) {
				if((i+j == 2)||(i-j==2)||(j-i==2)||(i + j == 6)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//hollow heart
		System.out.println("hollow heart:");
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 6; j++) {
				if((i==0 && j%3!=0) || (i==1 && j%3 ==0) || i-j ==2 || i+j == 8) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//upside down V
		System.out.println("upside down V:");
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 8; j++) {
				if(i + j == 4 || j - i ==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
















