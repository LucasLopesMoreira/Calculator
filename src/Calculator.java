// Import required classes for handling user input
import java.util.Scanner;

/**
 * The Calculator class is a simple command-line calculator that can perform
 * basic arithmetic operations like addition, subtraction, multiplication, and division.
 */
public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Prompt the user to enter an operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Call the performOperation method to get the result
        double result = performOperation(number1, number2, operation);

        // Display the result
        System.out.println("The result is: " + result);
    }

    /**
     * Perform the arithmetic operation on the given numbers.
     *
     * @param number1   The first number.
     * @param number2   The second number.
     * @param operation The operation to be performed (+, -, *, /).
     * @return The result of the operation.
     */
    public static double performOperation(double number1, double number2, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operation. Please use +, -, *, or /.");
                System.exit(1);
        }

        return result;
    }

    
}
