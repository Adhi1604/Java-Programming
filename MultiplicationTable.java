import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("Enter a limit: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter a table: ");
		int t = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(t+"x"+i+" = "+(t*i));
		}
	}

}
