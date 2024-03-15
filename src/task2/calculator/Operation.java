package task2.calculator;

public abstract class Operation {
    protected double value1;
    protected double value2;


    public Operation(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public abstract double calcOperation(double value1, double value2);
}
