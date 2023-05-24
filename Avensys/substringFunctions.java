package com.java.programs;

public class substringFunctions {

    public static void main(String[] args) {
        String s1 = "This is Avensys Class";
        System.out.println(s1.toUpperCase());
        System.out.println("***************");
        System.out.println(s1.toLowerCase());
        System.out.println("***************");
        System.out.println(s1.contains("Class"));
        System.out.println("***************");
        System.out.println(s1.contains("Python"));
        System.out.println("***************");
        System.out.println(s1.indexOf('T'));
        System.out.println("***************");
        System.out.println(s1.charAt(2));
        //starts at 8th index
        System.out.println("***************");
        System.out.println(s1.substring(8));
        System.out.println("***************");
        System.out.println(s1.substring(8, 12));
    }
}
