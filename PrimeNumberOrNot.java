import java.util.Scanner;
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = ab.nextInt();
        int count = 0;
   
        	if(num>1) {
        		for(int i=2;i<num;i++) {
            		if(num%i==0) {
                    	count++;
                    }
            	}
        		if(count>0) {
              	  System.out.println(num+" is not a Prime number");
              	}
                else{
                  System.out.print(num+" is a Prime Number");
                } 
        	}else {
        		System.out.println(num+" is not a prime number");
        	}
       
        	    
        }
	}


