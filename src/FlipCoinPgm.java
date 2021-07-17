import java.util.Scanner;
public class FlipCoinPgm {

	public static void main(String[] args) {
		/*
		 * Ask User To Flip The Coin
		 * Calculate The Head Count And Tail Count
		 * Calculate The Percentages Of Head Count And Tail Count
		 */
		int i,n=0;
		double headcount=0,headpercentage=0;
		double tailcount=0,tailpercentage=0;
		System.out.println("Welcome to flip coin program");
		//Asking user to how many times the coin has to flip
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number how many times to flip the coin ");
		n = sc.nextInt();
		//loop for to print number of head count and tail count
		for (i=0;i<n;i++) {
		//To print random number to get head count and tail count
		double random = Math.random() ;
		if (random > 0.5) {
			headcount++;
			}
		else {
			tailcount++;
			}}
		System.out.println("headcount is " +headcount);
		System.out.println("tailcount is " +tailcount);

		//calculating percentages of head count and tail count 
		headpercentage = ((headcount / n) * 100);
		tailpercentage = ( (tailcount / n) *100);
		System.out.println("headpercentage is - " +headpercentage);
		System.out.println("tailpercentage is - " +tailpercentage);
	}
}