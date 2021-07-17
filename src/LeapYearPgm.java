//Importing Java Util Package
import java.util.Scanner;
public class LeapYearPgm {
	/*Ask User To Enter a Year
	 * And Check It Is a Leap Year Or Not
	 */
	public static void main(String[] args) {
		int c,year;
		//Ask user to enter the year
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year want to check");
		year = sc.nextInt();
		//condition to check year is leap or not and printing the year is leap or not 
		c = (year % 4);
		if (c == 0) {
			System.out.println("The year "+year+" is not leap year");
				}
		else {
				
			System.out.println("The year "+year+" is leap year");
				}
			}
		}
	