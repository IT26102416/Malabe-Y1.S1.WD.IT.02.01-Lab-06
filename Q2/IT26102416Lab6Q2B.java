import java.util.Scanner;

public class IT26102416Lab6Q2B {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i = 1;
		int number;
		System.out.println ( " please enter 10 numbers: ");
		String numbers = " ";
		
		while (i<10) {
			System.out.print( " Enter number" + i + ":");
			number = input.nextInt();
			
			numbers = numbers + number + " " ;
			
			i++;
			
		}

		   System.out.println(" The numbers you entered are : " + numbers);
	}
		
		
}	
	
	