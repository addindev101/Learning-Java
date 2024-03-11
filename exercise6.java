package programExercise;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("We are going to do Addition, Substraction, Multiplication and Division.");
        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        int resultAdd = (firstNumber + secondNumber);
        int resultSub = (firstNumber - secondNumber);
        int resultMulti = (firstNumber * secondNumber);
        int resultDiv = (firstNumber / secondNumber);

        System.out.println("Result of Addition = " + resultAdd);
        System.out.println("Result of Substraction = " + resultSub);
        System.out.println("Result of Multiplication = " + resultMulti);
        System.out.println("Result of Division = " + resultDiv);

        scanner.close();
    }    
}
