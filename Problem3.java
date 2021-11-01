package problem3;
import java.util.Scanner;
public class Problem3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your integer");
		int number = input.nextInt();
		if (number%2==0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");

  }
}
