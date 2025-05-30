package javabasics;

public class BuzzNumber {

	public static void main(String[] args) {
		int  
		p=100,
		q=390;
		
		 System.out.println("Buzz Numbers: ");
		 while(p<q) {
			 p++;
			 if(p % 7 == 0 && p%10==7)
			 { 
			    System.out.println(p);
			 }
		 }
		 
	}

}
// A Buzz number is a number that is divisible by 7 or ends with the digit 7.
// For example, 7, 14, 21, 27, 35, etc. are Buzz numbers.
