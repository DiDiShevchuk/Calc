package task2.calculator;

import java.util.Date;

public class HistoryOperation {
    private static final String[] operations = new String[5]; // массив для сохранения истории
    private static int count = 0;

    public void archiveOperation(String firstValue, String secondValue, String operator, double result) {
        Date date = new Date();

        int index = count % operations.length; // используем остаток от деления, гарантируем, что таким образом никогда не выйдем за переделы массива и история записей будет перезаписываться всегда
        System.out.println("Count: " + count + ", Index: " + index);
        operations[index] = firstValue + " " + operator + " " + secondValue + " = " + result + "| дата " + date;
        count++;
    }

    public static void printToHistory() {
        if (count == 0) {
            System.out.println("история пуста");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(operations[i]);
        }
    }
}

