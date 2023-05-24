package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionHandlingPrac {
    public static void main(String[] args) {
        try {
            System.out.println("Connection Established");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Numerator");
            int a = scan.nextInt();
            System.out.println("Enter the Denominator");
            int b = scan.nextInt();
            int c = a / b;
            System.out.println("Result is: " + c);
            System.out.println("Enter the length of the array");
            int len = scan.nextInt();
            int arr[] = new int[len];
            System.out.println("Enter the element to be stored in the array");
            int ele = scan.nextInt();
            System.out.println("Enter the position of the element");
            int pos = scan.nextInt();
            arr[pos] = ele;
            System.out.println("The element " + ele + " is successfully stored at position " + pos);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot give second input as zero, because numerator cannot be divided by 0");
        } catch (NegativeArraySizeException ne) {
            System.out.println("Invalid Array Size: Negative value aren't allowed");
        } catch (InputMismatchException ie) {
            System.out.println("Invalid Input: Please enter a valid number");
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Invalid position: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Some problem occurred");
        }
        System.out.println("Connection is closed");
    }
}
