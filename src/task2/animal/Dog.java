package task2.animal;

public class Dog extends Animal{
    private String breed;

    @Override
    public void voice() {
        System.out.println("Гав- гав");
    }
}
