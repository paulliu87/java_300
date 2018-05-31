public class BreakCyc {
    public static void main(String[] args) {
        printScores();
    }
    private static void printScores() {
        System.out.println("\n--------------Break when PEACH shows up---------------\n");
        String[] arr1 = new String[] {"Apple", "Orange", "Banana", "WaterMelon", "Pineapple"};
        for (String fruit : arr1) {
            if (fruit.equals("Peach")) {
                System.out.println("I have found a peach!");
                break;
            } else {
                System.out.print(fruit + "!\t");
            }
        }

        System.out.println("\n--------------Break when score is bad!---------------\n");
        int[][] arr2 = new int[][] {{92, 83, 72}, {62, 20, 100}, {34, 92, 72}};
        System.out.println("Grades: \nEnglish\tMath\tPhysics");

        No1: for (int[] list : arr2) {
            for (int score : list) {
                System.out.print(score+ "\t");
                if (score < 60) {
                    System.out.println("\nI found F");
                    break No1;
                }
            }
            System.out.println("");
        }
    }

}
