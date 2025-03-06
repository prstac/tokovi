import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter the data");
        String read = reader.readLine();

        System.out.println("You entered: " + read);
        
    }
}