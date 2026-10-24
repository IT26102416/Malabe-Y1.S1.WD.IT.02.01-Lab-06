import java.util.Scanner;

public class  IT26102416Lab6Q2C {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 1 ;
		int number;
		System.out.println ( " please enter 10 numbers: ");

		int sum = 0;
		double average;
		String numbers = "";
		
		while (i<=10) {
			System.out.print(" Enter number " + i + " : ");
			number = input.nextInt();
			
			numbers =  numbers + number + " ";
			sum = sum + number ;
			i++;
		}
            average = sum/10.0;

			System.out.println("The number you entered are ="+numbers);
			
			System.out.println("Sum of the number = "+sum);
			System.out.println("Average of the number = " + average);
	}
}	