// TypeD - Problem 4
// Write a Java program to print numbers between 1 to 100, divisible by 5, 8, and both. 

public class TypeD4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Printing Numbers Divisible by 5, 8, and both.
            if (i % 5 == 0 && i % 8 == 0) {
                System.out.println(i + " is divisible by both 5 and 8");
            // Printing Numbers Divisible by 5
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            // Printing Numbers Divisible by 8
            } else if (i % 8 == 0) {
                System.out.println(i + " is divisible by 8");
            }
        }
    }
}
