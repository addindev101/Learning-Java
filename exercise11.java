package programExercise;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);

        scanner.close();
    }
}
