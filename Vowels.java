import java.util.Scanner;


public class Vowels {
	public static void main(String[] args) {
		System.out.println("Enter Character: ");
		Scanner sc = new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		char z=Character.toUpperCase(c); 
		
	  switch(z) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': System.out.println(z+" is a Vowel.");
		break;
		default: System.out.println(z+" is a Non-Vowel Character.");
	  }
	}
}
