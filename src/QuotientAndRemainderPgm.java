//Importing The Java UtilScanner Program
import java.util.Scanner;
public class QuotientAndRemainderPgm {
	/*
	 * Ask User To Enter Two Numbers
	 * And Print The quotient And Remainder Of Two Numbers 
	 */
	public static void main(String[] args) {
		int dividend,divisor;
		int quotient,remainder;
		System.out.println("Welcome to the quotient and remainder progarm");
		//Printing the dividend and divisor values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of dividend and divisor : ");
		dividend = sc.nextInt();
		divisor = sc.nextInt();
		//Condition to print Quotient and Remainder 
		quotient = (dividend / divisor);
		remainder = (dividend % divisor);
		System.out.println("The Quotient is : " +quotient);
		System.out.println("The Remainder is : " +remainder);
	}	
}