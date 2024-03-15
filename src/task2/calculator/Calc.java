package task2.calculator;

public class Calc {
    private HistoryOperation historyOperation;

    public Calc() {
        this.historyOperation = new HistoryOperation();
    }

    public void calculate(String line) {
        String[] mathOperation = line.split("\\D"); // делим строку на части и достаем числа
        String operator = line.replaceAll("[0-9]", "").trim(); // удаляем числа и пробелы
        String valueFirst = mathOperation[0];
        String valueSecond = mathOperation[1];


        double value1 = Double.parseDouble(valueFirst);
        double value2 = Double.parseDouble(valueSecond);
        Operation operation = null;
        switch (operator) {
            case "+" -> operation = new Plus(value1, value2);
            case "-" -> operation = new Minus(value1, value2);
            case "*" -> operation = new Multiply(value1, value2);
            case "/" -> operation = new Divide(value1, value2);
            case "%" -> operation = new Remainder(value1, value2);
            default -> System.out.println("Введённые значения не корректны");
        }
        if(operation == null){
            System.out.println("Вы ввели не математическое выражение");
        } else {
            double result = Math.round(operation.calcOperation(value1, value2) * 100);
            result = result / 100;
            System.out.println("Ответ:  " + result);
            historyOperation.archiveOperation(valueFirst, valueSecond, operator, result);
        }

    }
}
