import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year:");
        long year;
        try {
            year = scan.nextLong();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("This is a leap year!");
            } else {
                System.out.println("This is not a leap year!");
            }
        } catch (Exception e) {
            System.out.println("It is not a valid year!");
        }
    }
}
