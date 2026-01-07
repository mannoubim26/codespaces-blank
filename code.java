/*
 SimpleCalculator.java
 A minimal interactive calculator for basic operations.

 Usage:
  - Compile: javac SimpleCalculator.java
  - Run:     java SimpleCalculator
*/
import java.util.Scanner;

public class SimpleCalculator {

    // Basic operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }
        return a % b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Interactive menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Simple Calculator");
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Modulo");
            System.out.println("6) Power (a^b)");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "0":
                    running = false;
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                    try {
                        System.out.print("Enter first number: ");
                        double a = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Enter second number: ");
                        double b = Double.parseDouble(sc.nextLine().trim());

                        double result;
                        switch (choice) {
                            case "1": result = add(a, b); break;
                            case "2": result = subtract(a, b); break;
                            case "3": result = multiply(a, b); break;
                            case "4": result = divide(a, b); break;
                            case "5": result = modulo(a, b); break;
                            default:  result = power(a, b); break;
                        }
                        System.out.println("Result: " + result);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Invalid number format. Please enter valid numbers.");
                    } catch (ArithmeticException ae) {
                        System.out.println("Error: " + ae.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown choice. Please enter 0-6.");
            }
        }

        System.out.println("Goodbye!");
        sc.close();
    }
}