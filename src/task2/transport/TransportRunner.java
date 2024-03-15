package task2.transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport auto = new Auto("BMW", "X6", 2023);
        Transport plane = new Plane("Airbus", "A-320", 2019);

        auto.moving();
        plane.moving();
        System.out.println("___________");
        print(auto, plane);

    }

    public static void print(TransportImpl... objects) {
        for (TransportImpl object : objects) {
            object.gasUp();
            object.toGo();
        }
    }

}
