package trafficlight;
import java.util.*;
public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,rem, sum = 0;
		System.out.println("Enter the numvar");
		num = sc.nextInt();
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println("sum is "+sum);
	}

}