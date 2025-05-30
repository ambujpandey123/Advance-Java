package javabasics;
import java.util.*;
//Convert an amount from INR to USD, EUR, GBP using a switch case on currency code.  
//formula: convertedAmount = inrAmount / exchangeRate USD=83.0, EUR=89.5,GBP=103.2

public class ConvertCurrency {
  public static void main(String[] args) {
	  int ch;
	  double rs;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("1. Rupees to Doollar \n2. Rupees to EUR \n3. Rupees to GBP\n");
	  System.out.print("Enter Your Choice: ");
	  ch= sc.nextInt();
	 
	  switch(ch) {
	  case 1:
		  System.out.print("Enter Currency in Rs: ");
		  rs= sc.nextDouble();
		  System.out.println(rs+" in Doller is : "+(rs/83.0)); break;
	  case 2:
		  System.out.print("Enter Currency in Rs: ");
		  rs= sc.nextDouble();
		  System.out.println(rs+" in EUR is : "+(rs/89.5));   break;
	  case 3:
		  System.out.print("Enter Currency in Rs: ");
		  rs= sc.nextDouble();
		  System.out.println(rs+" in GBP is : "+(rs/103.2));   break;
		  
	default: 
		System.out.println("Invalid Choice");
	  }
	  sc.close();
  }
}
