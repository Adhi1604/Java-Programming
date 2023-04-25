import java.util.Scanner;

public class DecimaltoBinaryNumber {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

//Decimal to Binary:
		System.out.println("Enter a Decimal Number: ");
		int n = sc.nextInt();
		System.out.println("Binary Equvalent of "+n+" is : "+Integer.toBinaryString(n));
		
//Binary to Decimal:		
		System.out.println("Enter Binary Number : ");
		String s = sc.next();
		System.out.println("Decimal Equvalent of "+s+" is : "+Integer.parseInt(s,2));
	}

}
