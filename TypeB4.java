// Type B - Question Number 4
// Write a program to accept the details of 4 persons (name, age, salary) and display the information row by row.


import java.util.Scanner;

public class TypeB4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store information for four persons
        String[] names = new String[4];
        int[] ages = new int[4];
        double[] salaries = new double[4];

        // Accept input for each person
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            // Accept name
            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            // Accept age
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            // Accept salary
            System.out.print("Salary: ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left by nextDouble()

            System.out.println(); // Add a newline for better readability
        }

        // Print the information row by row
        System.out.println("Person Information:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Salary: " + salaries[i]);
            System.out.println(); // Add a newline for better readability
        }

        // Close the scanner
        scanner.close();
    }
}
