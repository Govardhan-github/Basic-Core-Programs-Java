//Importing Java Util Scanner Program
import java.util.Scanner;
public class PowerOf2Pgm {
	/*
	 *Ask User To Print The Powers Of 2 Number
	 */
	public static void main(String[] args) {
		int n,i;
		//Welcome message added
		System.out.println("Welcome to the powers of 2 program" );
		//Ask user to print how many powers user want
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of powers you want:" );
		n = sc.nextInt();
		//for loop for to print powers of 2
		for(i=1;i<=n;i++) {
		int pow = (int)(Math.pow(2,n));
		System.out.println("The power of 2 is :" +pow);
	}
  }
}

