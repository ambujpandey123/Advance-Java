public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }
}