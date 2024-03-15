package task2.animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        /** вариант 1
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.voice();
        dog.voice();
        cat.voice();
         */

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal[] animals = new Animal[]{animal, dog, cat};
        print(animals);

    }
    public static void print(Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();
        }
    }

}
