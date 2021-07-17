//Importing The Jva Util Scanner Package
import java.util.Scanner;
public class NumberCheckingPgm {
	/*
	 * Ask User To Enter a Number
	 * And Check That Number Is Even Or Odd
	 * And Print The Number
	 */
	public static void main(String[] args) {
		int num,check;
		System.out.println("Welcome to the checking number is even or odd number program");
		//Ask user to enter the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check :");
		num=sc.nextInt();
		//Condition to checking the number
		check = num % 2 ;
		if(check == 0) {
			System.out.println("The number "+num+" is even number ");
					}
		else {
			System.out.println("The number "+num+" is odd number ");
		}
	}
}