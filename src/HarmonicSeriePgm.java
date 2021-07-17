//Importing java Utill Scanner Package
import java.util.Scanner;
public class HarmonicSeriePgm {
	/*
	 * Ask User To Enter a Number
	 * And Print The Harmonic Series
	 */
	public static void main(String[] args) {
		int num;
		double h;
		System.out.println("Welcome To The Harmonic Series Pgm");
		//Ask user to enter the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		System.out.println("Hramonic series is: ");
		h=0;
		//while loop for to print harmonic values of given number
		while(num>0) {
				h= h + (double) 1 / num;
		num--;
		System.out.println(h +" ");
		}
		//System.out.println("");
		System.out.println("The output os series is :" +h);
		}
}
