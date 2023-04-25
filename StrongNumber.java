
public class StrongNumber {

	public static void main(String[] args) {
		
		int num = 145;
		int num1 = num; 
		int sum = 0;
		
		while(num > 0) {
			int fact=1;
			int rem = num%10;
		
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num = num/10;
	   }
	   if(sum == num1) {
		   System.out.println(num1+" is Strong Number");
	   }
	   else {
		   System.out.println(num1+" is not Strong  Number");
	   }
	}

}
