class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Method overloading
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String type) {
        System.out.println(name + " makes a " + type + " sound");
    }

    // Overriding toString() from Object class
    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "'}";
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Tommy", "Labrador");

        // Method overloading
        animal.sound();
        animal.sound("loud");

        // Printing objects calls toString()
        System.out.println(animal);
        System.out.println(dog);
    }
}
