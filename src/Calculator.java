public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        System.out.print("Enter the second number: ");

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = performOperation(number1, number2, operation);

        System.out.println("The result is: " + result);

    }
}
