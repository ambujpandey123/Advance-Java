import java.util.*;
public class paliPalindromeNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,rem,rev=0,copy;
		System.out.println("Enter the number");
		num=sc.nextInt();
		copy = num;
		while(num>0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		if(copy == rev) {
			System.out.println("Is Palindrome");
		}
		else 
			System.out.println("not a palindrome");
	}

}
