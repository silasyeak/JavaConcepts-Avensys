package com.java.programs;

import java.util.Scanner;

class stringChecker {
    boolean checkForS(String s) {
        boolean valid = false;
        for(int i = 0; i <= s.length() -1; i++) {
            if((s.charAt(i) == 's') || (s.charAt(i) == 'S')){
                valid = true;
            }
        }
        return valid;
    }
    
    boolean equalStrings(String s1, String s2) {
    	if(s1.equalsIgnoreCase(s2)) {
    		return true;
    	}
    	else return false;
    }
    
    String compareStrings(String s1, String s2) {
    	if(s1.compareTo(s2)> 0) {
    		return s1 + " is greater";
    	}
    	else if (s1.compareTo(s2) == 0) {
    		return "both Strings are equal";
    	}
    	else {
    		return s2 + " is greater";
    	}
    }
    
    boolean checkForSCharArray(String s) {
    	char ch[] = s.toCharArray();
    	boolean valid = false;
    	for(int i = 0; i < ch.length; i++) {
    		if((ch[i] == 's')||(ch[i] == 'S')) {
    			valid = true;
    		}
    	}
    	return valid;
    	
    }
    
}

public class MethodOverloadingEx {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name you are checking?");
        String enterName = input.next();
        
        System.out.println("Give me a second name");
        String enterName2 = input.next();
        
        stringChecker check = new stringChecker();
        System.out.println("------------------------------------");
        System.out.println("Comparing name 1 against name 2,");
        System.out.println(check.compareStrings(enterName, enterName2));
        
        System.out.println("-------------------------------------");
        if(check.checkForSCharArray(enterName)) {
        	System.out.println("Program 4 method:");
        	System.out.println("Yes, it contains an 's'");
        }
        else {
        	System.out.println("Program 4 method:");
        	System.out.println("No, it does not contain an 's'");
        }
    }
    
//    public class MethodOverloadingEx {
//        public static void main(String args[]) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("What is the name you are checking?");
//            String enterName = input.next();
//            
//            System.out.println("Give me a second name");
//            String enterName2 = input.next();
//            
//            stringChecker check = new stringChecker();
//            if(check.checkForS(enterName)) {
//                System.out.println("Yes, it contains an 's'");
//            }
//            else {
//                System.out.println("No, it does not contain an 's'");
//            }
//            System.out.println("------------------------------------");
//            
//            if(check.equalStrings(enterName, enterName2)) {
//            	System.out.println("Both names are the same");
//            }
//            else {
//            	System.out.println("The names are different");
//            }
//            System.out.println("------------------------------------");
//            System.out.println("Comparing name 1 against name 2,");
//            System.out.println(check.compareStrings(enterName, enterName2));
//            
//            System.out.println("-------------------------------------");
//            if(check.checkForSCharArray(enterName)) {
//            	System.out.println("Program 4 method:");
//            	System.out.println("Yes, it contains an 's'");
//            }
//            else {
//            	System.out.println("Program 4 method:");
//            	System.out.println("No, it does not contain an 's'");
//            }
//        }
}
