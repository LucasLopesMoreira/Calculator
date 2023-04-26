/**
 * The Division class represents the division operation.
 */
public class Division implements operation {
    @Override
    public double perform(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return number1 / number2;
    }
}
