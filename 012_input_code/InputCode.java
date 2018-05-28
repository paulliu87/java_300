import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your student ID:");
        String id = scanner.nextLine();
        System.out.println("Your id is " + id.length() + " charactors long.");
    }
}
