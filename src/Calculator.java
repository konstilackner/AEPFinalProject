/**
 * Created by Konstantin on 25.04.16.
 */
public class Calculator {

    private final double amount;

    public Calculator(double amount) {
        this.amount = amount;
    }

    public double add(double i) {
        return this.amount + i;
    }

    public double multiply(double v) {
        return this.amount * v;
    }

    public double subtract(double v) {
        return this.amount - v;
    }
}
