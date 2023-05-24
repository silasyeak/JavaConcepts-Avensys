package com.java.programs;

import java.util.Scanner;

public class twoDthreeDarrays {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[][] = new int[5][3];
		int c[][][] = new int[5][3][2];
		System.out.println("1D length: " + a.length);
		System.out.println("2D array length: " + b.length);
		System.out.println("3D array length: " + c.length);
		System.out.println(c[0][0].length);
		
		Scanner scan = new Scanner(System.in);
		int twoD[][] = new int[5][6];
		for(int i = 0; i <= twoD.length - 1; i++) {
			for(int j = 0; j <= twoD[i].length - 1; j++) {
				System.out.println("marks of " + (i+1) + "class" + (j+1) + " student is" + twoD[j][i]);
				twoD[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i <= twoD.length - 1; i++) {
			for(int j = 0; j <= twoD[i].length - 1; j++) {
				System.out.println("marks of " + (i+1) + "class" + (j+1) + " student is" + twoD[i][j]);
			}
		}
		
	}

}
