package javabasics;
import java.util.*;
public class ElectricityBill {
	public static void main(String[] args) {
		int units;
		double amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		units=sc.nextInt();
		if(units>0&&units<=100)
		amt=units*2;
		else if(units>100&&units<=200)
		amt=100*2+(units-100*1.8);
		else
		amt=100*2+100*1.8+(units-200)*1.5;
		amt=amt+200;
		System.out.println("Total electricity bill paid by the consumer is"+amt);

	}
}

// This program calculates the electricity bill based on the number of units consumed.
// The rates are as follows:
// - For the first 100 units: ₹2 per unit
// - For the next 100 units (101 to 200): ₹1.8 per unit	
// - For units above 200: ₹1.5 per unit
// Additionally, a fixed charge of ₹200 is added to the total bill.

