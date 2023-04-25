import java.util.Scanner;
public class LargestOfThreeNumber {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		
        System.out.println("Enter First Number");
        int a = ab.nextInt();
        System.out.println("Enter Second Number");
        int b = ab.nextInt();
        System.out.println("Enter Third Number");
        int c = ab.nextInt();
      
        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest +" is Largest Number");
	}

}
