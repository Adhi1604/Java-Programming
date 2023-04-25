
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num =153;
		int num1 = num;
		int arm = 0;
		int rem;
		
		while(num>0){
			rem = num%10;
			arm = arm+(rem*rem*rem);
			num = num/10;
		}
		if(num1 == arm){
			System.out.println("The number "+num1+" is Armstrong Number");
		}else {
			System.out.println("The number "+num1+" is not Armstrong Number");
		}
	}

}
