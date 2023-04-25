import java.util.Random;

public class RandomNumberandStrings {

	public static void main(String[] args) {

//1.
		System.out.println(Math.random()); //random decimal number
		
//2.
		Random rand = new Random();

		System.out.println(rand.nextInt());   //random number
		System.out.println(rand.nextDouble());//random double
		System.out.println(rand.nextFloat()); //random float

//3.
		/* Appache commons-lang api:
		 
		   https://common.apache.org/ 
		 
		 String rand_num = RandomStringUtils.randomNumeric(10);
		 System.out.println(rand_num);
		 String rand_str = RandomStringUtils.randomAlphabetic(5);
		 System.out.println(rand_str);
		 
		*/
	}

}
