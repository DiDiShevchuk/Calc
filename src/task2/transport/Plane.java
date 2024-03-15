package task2.transport;

public class Plane extends Transport implements TransportImpl{
    private int countMotor;

    public Plane(String brend, String model, int countMotor) {
        super(brend, model);
        this.countMotor = countMotor;
    }

    @Override
    public void moving() {
        System.out.println("лечу в воздухе");
    }

    @Override
    public void gasUp() {
        System.out.println("Я " + this.getBrend() + " " + this.getModel()  + " заправился");
    }
    @Override
    public void toGo(){
        System.out.println("Я " + this.getBrend() + " "  + this.getModel()  + " поехал");
    }

}
