package task1.computer;

public class Computer {
    private int ssd = 500;
    private long ram;
    Computer(){
        System.out.println("Я был создан");
    }
    Computer(int newSsd){
        ssd = newSsd;
    }
    Computer(int newSsd, long newRam){
        ssd = newSsd;
        ram = newRam;
    }
    Computer(long newRam, int newSsd){
        this.ssd = newSsd;
        ram = newRam;
    }
    void load(){
        System.out.println("Я загрузился");
    }
    void load(boolean open){
        System.out.println("Я загрузился");
        if(open){
            System.out.println("Я открыл крышку ");
        }
    }
    void printState(){
        System.out.println("ssd: " + ssd);
        System.out.println("ram:  " + ram);
        System.out.println();
    }

}
