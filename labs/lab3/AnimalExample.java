import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose animal (1: Animal, 2: Dog, 3: Cat):");
        int choice = sc.nextInt();

        Animal obj;

        if (choice == 1) {
            obj = new Animal();
        } else if (choice == 2) {
            obj = new Dog();
        } else {
            obj = new Cat();
        }

        obj.makeSound();
    }
}

// Output:
/*
The animal makes a sound.
The dog barks.
The cat meows.
*/
