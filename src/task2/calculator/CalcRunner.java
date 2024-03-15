package task2.calculator;

import java.util.Scanner;

public class CalcRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        while (true) {
            System.out.print("Введите выражение или введите СТОП, чтобы выйти : ");
            String line = scanner.nextLine();
            if ("СТОП".equalsIgnoreCase(line)) {
                break;
            } else if ("сохраняем выражения".equalsIgnoreCase(line)) {
                HistoryOperation.printToHistory();
                continue;
            }
            calc.calculate(line);
        }
        System.out.println("вывести на консоль историю операций? Введите: Да или Нет ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            HistoryOperation.printToHistory();
        }
    }
}
