package programExercise;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Input height: ");
        double height = scanner.nextDouble();

        double area = (weight * height);
        double perimeter = (2 * (weight + height));

        System.out.println("Result for area is " + area + " and perimeter is " + perimeter);

        scanner.close();
    }
}
