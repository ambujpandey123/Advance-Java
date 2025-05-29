import java.util.*;

class Graade{
    public static void main(String[] args){
        int marks;
        String grade;
        double avg;
        int totalMarks = 600;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks(out of 600) : ");
        marks = sc.nextInt();
        avg = marks / 6.0;
        if (avg >= 90){
            grade="A+";
        } 
        else if (avg >= 80){
            grade="A";
        } 
        else if (avg >= 70){
            grade="B+";
        } 
        else if (avg >= 60){
            grade="B";
        } 
        else if (avg >= 50){
            grade="C+";
        } 
        else if (avg >= 40){
            grade="C";
        } 
        else {
            grade="F";

        }
        System.out.println("Marks : " + marks);
        System.out.println("Total marks : " + totalMarks);
        System.out.println("Average marks : " + avg);
        System.out.println("Grade : " + grade);
    }
}