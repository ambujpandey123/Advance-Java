package javabasics;
import java.util.Scanner;
public class NeonNo {

	public static void main(String[] args) {
		 int num,sum=0,newnum=0;
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the number : ");
	      num = sc.nextInt();
	      newnum = (int) Math.pow(num, 2);
	      while(newnum>0) {
	    	  sum += newnum % 10 ;
	    	  newnum = newnum / 10;
	    	  
	      }
	      System.out.println(sum==num?"Neon Number":"Not Neon Number");
	}
}

//
// A Neon number is a number where the sum of the digits of its square equals the original number.
// For example, 9 is a Neon number because 9^2 = 81 and 8 + 1 = 9.