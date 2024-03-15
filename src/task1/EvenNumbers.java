package task1;
//  Напишите метод, который принимает массив целых чисел и возвращает новый массив, содержащий только четные элементы исходного массива.


public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {8, 5, 3, 1, 2, 10, 0, 6};
        evenValue(array);
    }

    public static int count(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int[] evenValue(int[] array) {
        int[] evenArray = new int[count(array)];
        int index = 0;
        for(int value : array){
            if(value % 2 == 0){
                evenArray[index++] = value;
            }
        }
        printArray(evenArray);
        return evenArray;
    }

    public static void printArray(int[] evenArray) {
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
    }
}
