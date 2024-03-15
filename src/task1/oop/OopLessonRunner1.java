package task1.oop;

public class OopLessonRunner1 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(1024), new Ssd(250), 3);
        Computer mobile = new Mobile(new Ram(125), new Ssd(512));

        Laptop laptop1 = new Laptop(new Ram(1000),new Ssd(5000), 5);

//        loadComputer(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop) { // приведение типов
                // Laptop laptop = (Laptop) computer;
                // laptop.open();
                ((Laptop) computer).open();
            }
            System.out.println();
        }
    }

    public static void loadComputer(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
