package exceptionhandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "Sorry, You need to be at least 18 to be on here"; 
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "Sorry, the max age we cater to is 45"; 
	}
}

class MatchFinderInterface {
	int age;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age = scan.nextInt();
	}
	
	public void verify() throws OverAgeException, UnderAgeException{
		if(age < 18) {
			UnderAgeException ua = new UnderAgeException();
			throw ua;
		} else if (age > 45) {
			OverAgeException oa = new OverAgeException();
			throw oa;
		}
		else {
			System.out.println("Welcome to MatchFinder");
		}
	}
}

class UseApplication{
	public void initiate() {
		MatchFinderInterface MFI = new MatchFinderInterface();
		try {
			MFI.acceptInput();
			MFI.verify();
		} catch (UnderAgeException ua) {
			System.out.println(ua.getMessage());
		} catch(OverAgeException oa) {
			System.out.println(oa.getMessage());
			
		}
	}
}

class MatchFinder{
	public static void main(String[] args) {
		UseApplication uApp = new UseApplication();
		uApp.initiate();
	}
}