import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to multiply by 16:");
        long number = scan.nextLong();
        System.out.println("The number you have entered is: " + number);
        System.out.println("The number * 2 is: " + (number << 1));
        System.out.println("The number * 4 is: " + (number << 2));
        System.out.println("The number * 8 is: " + (number << 3));
        System.out.println("The number * 16 is: " + (number << 4));
    }
}
