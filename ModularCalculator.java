import java.util.Scanner;

/**
 * Task 4: Method Design & Modular Calculator
 * Author: Pavan Teja
 */

public class ModularCalculator {

    // --------- Arithmetic Methods ---------

    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers with exception handling
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // --------- Utility Method ---------

    // Prints result (reusable method)
    static void printResult(String operation, double result) {
        System.out.println("Result of " + operation + " = " + result);
    }

    // --------- Pass-by-Value Demonstration ---------

    static void modifyValue(int x) {
        x = x + 10;
        System.out.println("Value inside method: " + x);
    }

    // --------- Main Method ---------

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Using arithmetic methods
        printResult("Addition", add(num1, num2));
        printResult("Subtraction", subtract(num1, num2));
        printResult("Multiplication", multiply(num1, num2));

        // Division with exception handling
        try {
            printResult("Division", divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Method Overloading demonstration
        printResult("Addition (double)", add(10.5, 5.5));

        // Pass-by-value demonstration
        int value = 20;
        System.out.println("Value before method call: " + value);
        modifyValue(value);
        System.out.println("Value after method call: " + value);

        sc.close();
    }
}
