public class SumandAverageofNnumbers {

	public static void main(String[] args) {
		
		
		int n = 1234567;
		int sum = 0;
		int count=0;
		
		while(n>0) {
			int rem =n%10;
			count++;
			sum=sum+rem;
			n=n/10;
		}
	    System.out.println(count);
		System.out.println("Sum of N numbers: "+sum );
		
		int avg = sum/count;
		System.out.println("Average of N numbers :"+avg);
	}
}
