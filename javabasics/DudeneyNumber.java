package javabasics;

import java.util.Scanner;

public class DudeneyNumber {

	public static void main(String[] args) {
		int num,sum=0,numCopy;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 numCopy=num = sc.nextInt();
		 
		 while(num>0) {
	    	  sum += num % 10 ;
	    	  num = num / 10;
	      }
		  System.out.println(Math.cbrt(numCopy) == sum ? "Dudeney Number" : "Not Dudeney Number");
	     
	      sc.close();
	}

}

// A Dudeney number is a positive integer that is a perfect cube,
// and the sum of its digits is equal to the cube root of the number.
// Example: 512 is a Dudeney number because 5 + 1 + 2 = 8 and 8^3 = 512.
// 512 -> sum of digits = 8, cube root of 512 = 8, so 512 is a Dudeney number.