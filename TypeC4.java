// Type C - Problem 4
/*
 * Construct the Java program by satisfying the following conditions
a) Give the input as the employee name and basic salary from the keyboard.
b) calculate the allowance as 10 % of the basic salary and add it to the basic salary
c) calculate the tax as 5 % of the basic salary and subtract it from the basic salary.
 c) calculate the net pay and print the net pay value. 
 */
import java.util.Scanner;

public class TypeC4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept input for employee name and basic salary
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble()

        // Calculate allowance (10% of basic salary) and add it to the basic salary
        double allowance = 0.10 * basicSalary;
        double totalSalary = basicSalary + allowance;

        // Calculate tax (5% of basic salary) and subtract it from the basic salary
        double tax = 0.05 * basicSalary;
        double netSalary = totalSalary - tax;

        // Print the employee details and net pay
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Tax: " + tax);
        System.out.println("Net Pay: " + netSalary);

        // Close the scanner
        scanner.close();
    }
}
