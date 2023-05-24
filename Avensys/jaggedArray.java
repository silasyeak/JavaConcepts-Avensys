package com.java.programs;
import java.util.*;

public class jaggedArray {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[5][];
        a[0] = new int[3];
        a[1] = new int[1];
        a[2] = new int[4];
        a[3] = new int[5];
        a[4] = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("bank: " + (i+1) + " customer: " + (j+1));
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

	}
