class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("Fox is making a sound");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit is jumping");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Fox fox = new Fox();
        Rabbit rabbit = new Rabbit();

        dog.eat();
        dog.bark();

        fox.eat();
        fox.sound();

        rabbit.eat();
        rabbit.jump();
    }
}
