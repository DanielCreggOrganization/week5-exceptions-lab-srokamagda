package ie.atu.exceptions;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))){
            String line = br.readLine();
            System.out.println(line);
        }catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
    
}
