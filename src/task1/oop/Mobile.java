package task1.oop;

public class Mobile extends Computer{
    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Я включился");
    }
}
