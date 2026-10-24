import java.util.Scanner;

public class IT26102416Lab6Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
	
	    int number;
	    int sum = 0;
	    int count = 0;
	    double rms;
	
	    System.out.println("Enter positive integers (terminate input with -99):");
	
	    System.out.print("Enter a number: ");
	    number = input.nextInt();
	
	    while (number != -99) {
		  if (number < 0) {
			System.out.println("Invalid input!Enter a positive integer.");
		  } else {
		    sum = sum + number * number;
			count++;
		  }

          System.out.print("Enter a number: ");
		  number = input.nextInt();
	    }
        if (count > 0) {
            rms = Math.sqrt((double) sum / count);
		    System.out.println("The Root Mean Squere ( RMS) : " + rms);
	    } else {
		    System.out.println("No positive numbers were entered.");
	    }
	}
}	
		
		
