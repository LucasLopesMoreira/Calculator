import java.util.Scanner;

/**
 * The InputHandler class is responsible for handling user input.
 */
public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    /**
     * Read a double value from the user.
     *
     * @param prompt The message to display to the user.
     * @return The entered double value.
     */
    public double readDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    /**
     * Read an operation symbol from the user.
     *
     * @param prompt The message to display to the user.
     * @return The entered operation symbol.
     */
    public char readOperationSymbol(String prompt) {
        System.out.print(prompt);
        char operationSymbol = scanner.next().charAt(0);

        while (operationSymbol != '+' && operationSymbol != '-' &&
               operationSymbol != '*' && operationSymbol != '/') {
            System.out.print("Invalid operation. " + prompt);
            operationSymbol = scanner.next().charAt(0);
        }

        return operationSymbol;
    }
}
