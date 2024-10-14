package ie.atu.exceptions;

public class GradingSystem {
    public static void main(String [] args){
        try{
            calculateGrade(105); //This will throw an exception
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void calculateGrade(int score){
        if (score < 0 || score > 100){
            throw new IllegalArgumentException("Invalid score");
        }
        System.out.println("Grade is valid.");
    }
    
}
