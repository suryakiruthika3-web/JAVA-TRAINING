public class Problem10 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Cat c = new Cat();
        c.sound();
        Dog d = new Dog();
        d.sound();
    }
}
class Animal {
    void sound(){
        System.out.println("I am Animal");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat meows");
    }
}