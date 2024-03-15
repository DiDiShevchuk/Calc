package task1;
//	Создайте метод, который принимает массив целых чисел и возвращает его в обратном порядке.

public class ReversArray {
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 83, 10, 500, 1};
        revers(array);
    }
    public static void revers(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
