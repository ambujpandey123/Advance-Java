package trafficlight;
import java.util.*;

public class fibonaciseries {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num,f1=0, f2 = 1, f3;
		System.out.println("Enter the no of fibonacci numbers to print");
		num = sc.nextInt();
		System.out.print("Fibonacci numbers are: " +f1 +" "+f2+" ");
		for(int i=1; i<num-1; i++) {
			f3 = f1+f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;
		}
	}

}
