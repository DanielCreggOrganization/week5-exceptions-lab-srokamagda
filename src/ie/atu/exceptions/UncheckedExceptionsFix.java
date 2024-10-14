package ie.atu.exceptions;

public class UncheckedExceptionsFix {
    public static void main(String[] arfgs){
        String text = "Hello World";
        System.out.println(text.length()); //Throws NullPointException

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); //Throws ArrayIndexOutOfBoundsException
    }

}
