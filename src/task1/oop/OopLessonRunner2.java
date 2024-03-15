package task1.oop;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ram(1024), new Ssd(250), 3);
        Printable mobile = new Mobile(new Ram(125), new Ssd(512));

        printWithRandom(laptop, mobile);
    }
    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
