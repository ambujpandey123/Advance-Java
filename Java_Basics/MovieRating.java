import java.util.*;

class MovieRating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rating (1-5): ");
        double rating = sc.nextDouble();
        String message = "";
        if(rating >= 5){
            message = "Excellent";
        }
        else if(rating >= 4){
            message = "Very Good";
        }
        else if(rating >= 3){
            message = "Good";
        }
        else if(rating >= 2){
            message = "Average";
        }
        else if(rating >= 1){
            message = "Poor";
        }
        else{
            message = "Invalid rating";
        }
        System.out.println("Your rating is: " + message);

        
    }
}