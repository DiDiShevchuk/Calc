package task1.oop;

public class CompositionRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
//        Computer computer = new Computer(ram, ssd);
//        computer.load();
        double sin = Math.sin(2.5);

        Laptop laptop = new Laptop(new Ram(512), new Ssd(250), 2);
        laptop.open();
        laptop.load();

        System.out.println(laptop.getClass());
        System.out.println(laptop);
    }
}
