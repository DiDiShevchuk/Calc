package task1;

import java.util.Arrays;

public class sortChoice {
    public static void main(String[] args) {
        int[] array = {8, 5, 3, 1, 2, 10, 0, 6};
        System.out.println(Arrays.toString(array));
        sortingByChoice(array);

    }

    public static void sortingByChoice(int[] array) {
        for (int step = 0; step < array.length; step++) {
            int index = minValue(array, step);

            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
            System.out.print(array[step] + " ");
        }
        System.out.println();
    }

    public static int minValue(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
