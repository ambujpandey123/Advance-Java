package javabasics;
import java.util.Scanner;

public class FestivalGift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalAmmount,discount,payAbleAmmountt;
		String gift;
		System.out.print("Enter Total Cost: ");
		totalAmmount=sc.nextInt();
		if(totalAmmount <= 2000) {
			discount = totalAmmount * 0.05;
			gift="Calculator";
		}
		else if(totalAmmount >= 2001 && totalAmmount <= 5000 ) {
			discount = totalAmmount * 0.1;
			gift=" School Bag";
		}
		else if(totalAmmount >= 5001 && totalAmmount <= 10000) {
			discount = totalAmmount * 0.15;
			gift="Wall Clock";
		}
		else {
			discount = totalAmmount * 0.2;
			gift="Wrist Watch" ;
		}
		payAbleAmmountt = totalAmmount-discount;
		System.out.println("Total Discount is :"+discount);
		System.out.println("Ammount to pay is :"+payAbleAmmountt);
		System.out.println("Your Gift is :"+gift);
	}
}

// Calculates discount and gift based on total purchase amount.
// Prompts user for total cost and applies discount rules.
// Displays discount, payable amount, and gift.
