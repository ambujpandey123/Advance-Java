import java.util.Scanner;

class PositiveNumAndEvenOdd{
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter a number to check odd or even: ");
    System.out.println(sc.nextInt() %2==0  ? "Number is Even ": "Number is Odd ");


    System.out.print("Enter a number to check positive or negative: ");
    System.out.println(sc.nextInt() >  0 ? "Number is Positive": "Number is Negative");
    
    }
}