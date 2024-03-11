package programExercise;

import java.util.Scanner;

public class exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Integer1;
        int Integer2;

        System.out.print("Enter first integer: ");
        Integer1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        Integer2 = scanner.nextInt();

        if (Integer1 != Integer2) {
            System.out.println(Integer1 + " != " + Integer2);
        } else {
            System.out.println(Integer1 + " = " + Integer2);
        }

        if (Integer1 < Integer2) {
            System.out.println(Integer1 + " < " + Integer2);
        } else if (Integer2 < Integer1) {
            System.out.println(Integer1 + " > " + Integer2);
        }

        if (Integer1 <= Integer2) {
            System.out.println(Integer1 + " <= " + Integer2);
        } else if (Integer2 <= Integer1) {
            System.out.println(Integer1 + " >= " + Integer2);
        } else if (Integer1 == Integer2) {
            System.out.println(Integer1 + " = " + Integer2);
        }

        scanner.close();
    }
}
