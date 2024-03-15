package task1.oop;

public abstract class Computer implements Printable {
    private Ram ram; // поля яв-ся свойствами объекта и их мы скрываем от пользователя
    private Ssd ssd;
//    {
//        System.out.println("init  block computer");
//    }
//    static {
//        System.out.println("static  block computer");
//    }

    public Computer() {
    }

    @Override
    public void print() {
        System.out.println("Ram: " + ram.getValue() + " Ssd: " + ssd.getValue());
    }


    public Computer(Ram ram, Ssd ssd) {
        super();
        this.ram = ram;
        this.ssd = ssd;
    }

    public abstract void load();

//    public void load() {
//        System.out.println("Я загрузился");
//    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    //    public void printState(){
//        System.out.println("Computer: ram " + ram.getValue() + " , ssd" + ssd.getValue());
//    }
}
