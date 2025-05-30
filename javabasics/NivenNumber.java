package javabasics;
import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Niven Number.");
        } else {
            System.out.println(num + " is NOT a Niven Number.");
        }

        sc.close();
    }
}

// A Niven number (or Harshad number) is an integer that is divisible by the sum of its digits.
// For example, 18 is a Niven number because 1 + 8 = 9 and 18 % 9 = 0.
