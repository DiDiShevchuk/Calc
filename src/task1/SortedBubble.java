package task1;

public class SortedBubble {
    public static void main(String[] args) {
        int[] sortedArray = {5, 8, 22, 48, 2, 96, 3, 0, 7, 1, 12, 9};
        sortedBubble(sortedArray);
    }

    public static void sortedBubble(int[] sortedArray) {
        boolean isSroted = false;  // массив отсортирован
        int count = 0;
        while (!isSroted) {
            isSroted = true;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i] < sortedArray[i - 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = temp;
                    isSroted = false;
                }
                System.out.print(sortedArray[i] + " ");
            }
            count++;
            System.out.println();
        }
        System.out.println("количество проходов цикла равно : " + count);
    }
}
