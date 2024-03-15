package task1;

import java.util.Date;
import java.util.Scanner;

public class Calculator {
    private static final String[] history = new String[10]; // массив для сохранения истории
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите выражение или введите СТОП, чтобы выйти : ");
            String line = scanner.nextLine();
            if ("СТОП".equalsIgnoreCase(line)) {
                break;
            } else if ("сохраняем выражения".equalsIgnoreCase(line)) {
                printToHistory();
                continue;
            }
            parseNumber(line);
        }
        System.out.println("вывести на консоль историю операций? Введите: Да или Нет ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printToHistory();
        }
    }


    public static void parseNumber(String line) {
        String[] mathOperation = line.split("\\D"); // делим строку на части и достаем числа
        String operator = line.replaceAll("[0-9]", "").trim(); // удаляем числа и пробелы

        if (mathOperation.length > 1) {
            String firstValue = mathOperation[0];
            String secondValue = mathOperation[1];

            calc(firstValue, secondValue, operator);
        }

        System.out.println();
    }


    public static void calc(String firstValue, String secondValue, String operator) {

        double firstNumber = Double.parseDouble(firstValue);
        double secondNumber = Double.parseDouble(secondValue);

        double result = switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> secondNumber != 0 ? firstNumber / secondNumber : Double.NaN;

            default -> Double.NaN;
        };
        System.out.println("ответ " + result);

        historyOperation(firstValue, secondValue, operator, result);
    }

    public static void historyOperation(String firstValue, String secondValue, String operator, double result) {
        Date date = new Date();
        if (count < history.length) {
            history[count++] = firstValue + " " + operator + " " + secondValue + " = " + result + "| дата " + date;
        }
    }

    public static void printToHistory() {
        for (int i = 0; i < count; i++) {
            if (count == 0) {
                System.out.println("история пуста");
                return;
            }
            System.out.println(history[i]);
        }
    }
}