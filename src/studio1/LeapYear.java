package studio1;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("What year would you like to see whether it is a leap year");
int year = s.nextInt();
boolean yearCheck = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
System.out.println(year+ " is a leap year: " +yearCheck);


	}
}
