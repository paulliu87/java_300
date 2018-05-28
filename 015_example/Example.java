import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = scan.nextLine();
        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] ^ 2000);
        }
        System.out.println("Your new password is:");
        System.out.println(new String(arr));
    }
}
