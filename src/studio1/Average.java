package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("What is the first number you want to be averaged?");
	double i1 = s.nextDouble();
	System.out.println("What is the next number you want to be averaged?");
	double i2 = s.nextDouble();
	double averagedDouble = ((i1 + i2) / 2);
	System.out.println("Here is your averaged number: " +averagedDouble);

}
}
