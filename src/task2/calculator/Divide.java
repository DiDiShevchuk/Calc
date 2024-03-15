package task2.calculator;

public class Divide extends Operation{
    public Divide(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double calcOperation(double value1, double value2) {
        double result = 0;
        if(value2 == 0){
            System.out.println("Делить на ноль нельзя, введите другое значение");
        } else {
            result = value1 / value2;
        }
        return result;
    }
}
