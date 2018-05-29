import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the total money you have spent:");
        float money = 0;
        String rebat = "";
        try {
            money = scan.nextFloat();
            // float money = (float) input;
            if (money > 200) {
                int grade = (int) money / 200;
                switch (grade) {
                    case 1:
                        rebat = "9.5";
                        break;
                    case 2:
                        rebat = "9";
                        break;
                    case 3:
                        rebat = "8.5";
                        break;
                    case 4:
                        rebat = "8";
                        break;
                    case 5:
                        rebat = "7.5";
                        break;
                    case 6:
                        rebat = "7";
                        break;
                    case 7:
                        rebat = "6.5";
                        break;
                    default:
                        rebat = "6";
                }
            }
        } catch (Exception e) {
            System.out.println("You have entered an invalid amount.");
        }
        if (money != 0) {
            System.out.println("You have spent " + money + " in our store.");
        }
        if (rebat.length() > 0) {
            System.out.println("We have applied a " + rebat + " discount on your purchase.");
        }
    }
}
