//Importing Java Util Scanner Package
import java.util.Scanner;
public class FactorsPgm {
	/*
	 * Ask User To Enter a Number
	 * And Print The Prime Factors To That Program
	 */
	public static void main(String[] args) {
		int number;
		System.out.println("Welcome to prime factors program");
		//Ask user to enter the number to print prime factors
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a number :");
	     number = sc.nextInt();
	     //For loop to print prime factors
	     for(int i = 2; i< number; i++) {
	     while(number%i == 0) {
	     System.out.println(i+" ");
	     number = number/i;
	      }
	      }
	      if(number >2) {
	        System.out.println(number);
	      }
	 }
}
