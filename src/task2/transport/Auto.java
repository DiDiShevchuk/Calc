package task2.transport;

public class Auto extends Transport implements TransportImpl{
    private int year;

    public Auto(String brend, String model, int year) {
        super(brend, model);
        this.year = year;
    }


    @Override
    public void moving() {
        System.out.println("еду по дороге");
    }

    @Override
    public void gasUp() {
        System.out.println("Я " + this.getBrend() + " " + this.getModel()  + " заправился");
    }
    @Override
    public void toGo(){
        System.out.println("Я " + this.getBrend() + " " + this.getModel()  + " поехал");
    }
}
