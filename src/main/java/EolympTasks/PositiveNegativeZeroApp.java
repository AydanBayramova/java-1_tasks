package EolympTasks;

import java.util.Scanner;

public class PositiveNegativeZeroApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
