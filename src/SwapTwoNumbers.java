//Importing The Jva Util Scanner Package
import java.util.Scanner;
public class SwapTwoNumbers {
	/*
	 * Ask User To Enter The Two Numbers
	 * And Swap The Two Numbers 
	 * Print The Swap Numbers
	 */
	public static void main(String[] args) {
		int A,B,s;
		//Ask user to enter the numbers for swap
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values of A and B to swap : ");
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println("Before swapping the numbers are : "+A+"  "+B);
		//condition for swapping two numbers
		s=A;
		A=B;
		B=s;
		System.out.println("After swapping the numbers are : "+A+"  "+B);
		}
}