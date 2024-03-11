package programExercise;

import java.util.Scanner;

public class exercise2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("We are going to do Addition, so please input your numbers!");
        System.out.print("Enter your first number: ");
        int userInput1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int userInput2 = scanner.nextInt();

        int inputAddition = (userInput1 + userInput2);

        System.out.print("Result is " + inputAddition);

        scanner.close();
    }
}
