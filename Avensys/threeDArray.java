package com.java.programs;

import java.util.Random;
import java.util.Scanner;

public class threeDArray {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
    	Random rand = new Random();
        
        int a[][][] = new int[3][][];
        a[0] = new int[3][];
        a[1] = new int[2][];
        a[2] = new int[4][];
        
        a[0][0] = new int[3];
        a[0][1] = new int[2];
        a[0][2] = new int[4];
        
        a[1][0] = new int[5];
        a[1][1] = new int[3];

        a[2][0] = new int[1];
        a[2][1] = new int[4];
        a[2][2] = new int[2];
        a[2][3] = new int[3];

        System.out.println("Enter the data into array");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int k = 0; k < a[i][j].length; k++) {
                    System.out.println("Enter " + (i+1) + " college " + (j+1) + " class " + (k+1) + " student's marks:");
                    a[i][j][k] = rand.nextInt(21) + 80;
                    System.out.println(a[i][j][k]);
                }
            }
        }
        System.out.println();
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int k = 0; k < a[i][j].length; k++) {
                    System.out.println("College: " + (i+1) + " Class: " + (j+1) + " Student: " + (k+1) + " Marks: " + a[i][j][k]);
                }
            }
        }
        
        System.out.println();
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    
    

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int a[][][] = new int[3][3][4];
//		
//		System.out.println("Enter the data into array");
//		for(int i = 0; i<=2; i++) {
//			for(int j = 0; j<=2; j++) {
//				for(int k=0; k <= 3; k++) {
//					System.out.println("Enter " + (i+1) + " college " + (j+1) + " class " + (k+1) + " student's marks:");
////					a[i][j][k] = scan.nextInt();
//				}
//			}
//		}
//		System.out.println();
//		for(int i = 0; i<=2; i++) {
//			for(int j = 0; j<=2; j++) {
//				for(int k = 0; k<=3; k++) {
//					System.out.print(a[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//
//	}

//	    public static void main(String[] args) {
//	        Scanner scan = new Scanner(System.in);
//
//	        int a[][][] = new int[3][][];
//	        a[0] = new int[3][];
//	        a[1] = new int[4][];
//	        a[2] = new int[2][];
	
//	        a[0][0] = new int[4];
//	        a[0][1] = new int[2];
//	        a[0][2] = new int[3];
//
//	        a[1][0] = new int[1];
//	        a[1][1] = new int[2];
//	        a[1][2] = new int[4];
//	        a[1][3] = new int[2];
//
//	        a[2][0] = new int[5];
//	        a[2][1] = new int[2];
//
//	        System.out.println("Enter the data into array");
//	        for(int i = 0; i < a.length; i++) {
//	            for(int j = 0; j < a[i].length; j++) {
//	                for(int k = 0; k < a[i][j].length; k++) {
//	                    System.out.println("Enter " + (i+1) + " college " + (j+1) + " class " + (k+1) + " student's marks:");
//	                    a[i][j][k] = scan.nextInt();
//	                }
//	            }
//	        }
//	        System.out.println();
//	        for(int i = 0; i < a.length; i++) {
//	            for(int j = 0; j < a[i].length; j++) {
//	                for(int k = 0; k < a[i][j].length; k++) {
//	                    System.out.print(a[i][j][k] + " ");
//	                }
//	                System.out.println();
//	            }
//	            System.out.println();
//	        }
//
//	    }

	}

	

