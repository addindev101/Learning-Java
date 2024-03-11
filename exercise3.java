package programExercise;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("We are going to do Division of two (2) numbers!");
        System.out.print("Enter your first number: ");
        int userInput1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int userInput2 = scanner.nextInt();

        int inputAddition = (userInput1 / userInput2);

        System.out.print("Result is " + inputAddition);

        scanner.close();
    }
}
