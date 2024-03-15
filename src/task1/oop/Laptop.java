package task1.oop;

/**
 * Mobile <- Laptop -> Computer <- Object
 */
public final class Laptop extends Computer {

    private int weight;

//    {
//        System.out.println("init  block laptop");
//    }
//
//    static {
//        System.out.println("static  block laptop");
//    }

    public Laptop(Ram ram, Ssd ssd, int weight) {
        // super(ram, ssd); // через super мы можем получить все методы родителя
        super(ram, ssd);
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("Constructor laptop");
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight " + weight);
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
