import java.util.Scanner;


public class changeBase {
	public static final Scanner kb = new Scanner (System.in);
	public static void main (String [] args){
		System.out.print("Choose which function to execute: 1) change base");
		switch (kb.nextLine().charAt(0)) {
		case '1':
			reportChangeBase();
			break;
		default:
			System.out.print("\nAll other functions under construction.");
			break;
		}
		System.out.print("\nthanks for playing");
		
		
		
	}
	public static void reportChangeBase () {
		System.out.print("Enter an original value in base 10:");
		int input = kb.nextInt();
		System.out.print("Enter an new base: (2, 8, or 10)");
		int newBase = kb.nextInt();
		int result = changeBase((double) input, newBase);
		System.out.print("\nThe result is: " + result);
	}
	public static int changeBase (double originalVal, int baseDestin){ 
		switch (baseDestin) {
		case 2:
			
		case 8:
		case 16:
		default:
			return 0;
			break;
		}
		
	}
}
