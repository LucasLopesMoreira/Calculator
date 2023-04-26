/**
 * The Addition class represents the addition operation.
 */
public class Addition implements operation {
    @Override
    public double perform(double number1, double number2) {
        return number1 + number2;
    }
}
