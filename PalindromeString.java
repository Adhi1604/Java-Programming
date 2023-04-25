import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Letter : ");
		String str = sc.next();
		String org_str=str;
		
		StringBuffer sb = new StringBuffer(str);
	    StringBuffer rev = sb.reverse();
	     
	     if(rev.toString().equalsIgnoreCase(org_str)) {
	    	 System.out.println(org_str +" is a Palindrome String");
	     }
	     else {
	    	 System.out.println(org_str +" is not a Palindrome String");
	     }
	}

}
