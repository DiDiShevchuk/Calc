package task2.calculator;

public class Minus extends Operation {
    public Minus(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double calcOperation(double value1, double value2) {
            return value1 - value2;
    }
}
