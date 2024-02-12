/**
 * TypeA-Problem4
 * Assign the two values in two variables. Write the Java program to swap the values in between. 
 */
public class TypeA4 {
    public static void main(String[] args) {
        // Assign values to two variables
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap values
        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
