package task2.transport;

public abstract class Transport implements TransportImpl {
    private String brend;
    private String model;

    public Transport() {
    }

    public Transport(String brend, String model) {
        this.brend = brend;
        this.model = model;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void moving() {
        System.out.println("Еду");
    }

}
