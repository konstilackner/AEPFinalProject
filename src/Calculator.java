/**
 * Created by Konstantin on 25.04.16.
 */
public class Calculator {

    public final double amount;

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

    public double divide(double v) {
        return this.amount / v;
    }

    public double sqrt() {
        return Math.sqrt(this.amount);
    }

    public double square() {
        return this.amount * this.amount;
    }

    public double log() {
        return Math.log(this.amount);
    }
}
