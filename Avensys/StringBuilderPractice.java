package com.java.programs;

public class StringBuilderPractice {
	   public static void main(String[] args) {
	       StringBuilder sb = new StringBuilder();
	       sb = sb.append("I love the internet");
	       StringBuilder sb2 = new StringBuilder();
	       sb2 = sb2.append("Hello");
	       System.out.println(sb.equals(sb));
	       System.out.println("----------------------");
	       System.out.println(sb.compareTo(sb2));
	       System.out.println("----------------------");
	       System.out.println(sb.indexOf("t"));
	       System.out.println("----------------------");
	       System.out.println(sb.charAt(5));
	       System.out.println("----------------------");
	       System.out.println(sb.substring(5));
	       System.out.println("----------------------");
	       System.out.println(sb.substring(2,9));
	       System.out.println("----------------------");
	       System.out.println(sb.append(""));
	       System.out.println("----------------------");
	       System.out.println(sb.insert(0, "Hello "));
	       System.out.println("----------------------");
	       System.out.println("capacity before: "+ sb.capacity() + " | String:"+  sb);
	       sb.ensureCapacity(50);
	       System.out.println("capacity after: "+ sb.capacity() + " | String:"+  sb);
	       System.out.println("----------------------");
	       System.out.println(sb.reverse());
	       System.out.println("----------------------");
	       System.out.println(sb.length());
	       System.out.println(sb.capacity());
	       
	    }
	}

