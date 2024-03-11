package programExercise;

public class exercise15 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;

        System.out.println("Before swap = " + var1 + " & " + var2);

        int swap = var1;
        var1 = var2;
        var2 = swap;

        System.out.println("After swap = " + var1 + " & " + var2);
    }
}
