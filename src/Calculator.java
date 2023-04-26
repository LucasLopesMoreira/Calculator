// Import required classes for handling user input
import java.util.Scanner;

/**
 * The Calculator class is a simple command-line calculator that can perform
 * basic arithmetic operations like addition, subtraction, multiplication, and division.
 */
public class Calculator {

    public static void main(String[] args) {
        // Create an InputHandler instance to handle user input
        InputHandler inputHandler = new InputHandler();

        // Prompt the user to enter two numbers
        double number1 = inputHandler.readDouble("Enter the first number: ");
        double number2 = inputHandler.readDouble("Enter the second number: ");

        // Prompt the user to enter an operation
        char operationSymbol = inputHandler.readOperationSymbol("Enter the operation (+, -, *, /): ");

        // Instantiate the appropriate operation class
        operation operation = createOperation(operationSymbol);

        // Call the perform method of the operation instance to get the result
        double result = operation.perform(number1, number2);

        // Display the result
        System.out.println("The result is: " + result);
    }

    /**
     * Create an instance of the appropriate operation class based on the given symbol.
     *
     * @param operationSymbol The operation symbol (+, -, *, /).
     * @return An instance of the corresponding operation class.
     */
    public static operation createOperation(char operationSymbol) {
        operation operation;

        switch (operationSymbol) {
            case '+':
                operation = new Addition();
                break;
            case '-':
                operation = new Subtraction();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation. Please use +, -, *, or /.");
        }

        return operation;
    }
}
