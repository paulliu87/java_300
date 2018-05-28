import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");

            System.setOut(ps);
            int age = 18;
            System.out.println("Initial default value for age is 18.");
            String gender = "female";
            System.out.println("Initial default value for gender is female.");
            String info = "This person is a " + gender + ", and has a age of " + age + ".";
            System.out.println("Combine two pieces of information of this person, the result is: " + info);
            System.setOut(out);
            System.out.println("Logging process is completed, please check log file for detail.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
