import java.util.Scanner;
class AreaOFShape{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Square\n5. Exit");
        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);

        switch(choice){
            case '1':
                System.out.print("Enter the radius of the Circle : ");
                double radius = sc.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.println("Area of Circle is : " + area);
                break;
            case '2':
                System.out.print("Enter the length of the Rectangle : ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the Rectangle : ");
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area of Rectangle is : " + area);
                break;
            case '3':
                System.out.print("Enter the base of the Triangle : ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the Triangle : ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle is : " + area);
                break;
            case '4':
                System.out.print("Enter the side of the Square : ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square is : " + area);
                break;
            case '5':
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                break;      
        }

    sc.close();
    }
}