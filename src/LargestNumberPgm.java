//Importing The Jva Util Scanner Package
import java.util.Scanner;
public class LargestNumberPgm {
	/*
	 * Ask User To Enter The Three Numbers
	 * And Write A Condition For To Print The Largest Number 
	 */
	public static void main(String[] args) {
		int a,b,c,largest,temp;
		System.out.println("Welcome to the checking greatest number program");
		//Ask user to enter the numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();
		System.out.println("Enter third number:");
		c = sc.nextInt();
		//Condition to check the greatest number
		temp = a > b ? a : b;
		largest= c > temp ? c : temp;
		System.out.println("The largest number is:" + largest);
		}
}