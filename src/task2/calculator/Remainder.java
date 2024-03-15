package task2.calculator;

public class Remainder extends Operation {
    public Remainder(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double calcOperation(double value1, double value2) {
        return value1 % value2;
    }
}
