package javabasics;

class AgeValidation extends Exception {
    public AgeValidation(String s) {
        super(s); // Call constructor of parent Exception
    }
}

public class CustomException {
    public static void checkAge(int age) throws AgeValidation {
        if (age < 18) {
            throw new AgeValidation("Age is not valid");
        } else {
            System.out.println("Age is Valid");
        }
    }

    public static void main(String args[]) {
        try {
            checkAge(17);
        } catch (AgeValidation ex) {
            // Print the message from AgeValidation object
            System.out.println(ex.getMessage());
        }
    }
}
