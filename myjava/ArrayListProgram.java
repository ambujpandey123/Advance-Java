package myjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> number = new ArrayList<Integer>();
		 for(int i=0;i<10;i++) {
			 System.out.print("Enter Number of "+i+" : ");
			 number.add(sc.nextInt());
		 }
        int sum=0;
        for(int num:number) sum+=num;
        
        System.out.println("\nSum of Number: "+sum);
	}

}
