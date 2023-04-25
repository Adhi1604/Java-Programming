import java.util.Scanner;

public class PalindromeNumber {
	
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int num1=num;
				
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		 if(rev.toString().equals(String.valueOf(num1))) {
		      System.out.println(num + " is a palindrome number.");
		    } else {
		      System.out.println(num + " is not a palindrome number.");
		    }  
	}
}
