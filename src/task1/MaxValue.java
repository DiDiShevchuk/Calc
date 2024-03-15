package task1;
//•	Напишите метод, который принимает массив целых чисел и возвращает максимальное значение в массиве.

public class MaxValue {
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 83, 10, 500, 1};
        maxElement(array);
    }

    public static void maxElement(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }

        }
        System.out.println(max);
    }

}
