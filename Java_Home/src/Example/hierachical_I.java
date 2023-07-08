package Example;

class Animal{
    void eat(){
        System.out.println("eating");
    }

}
class dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class cat extends Animal{
    void meow(){
        System.out.println("meow.......");
    }
}

public class hierachical_I {
    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();
        c.meow();
        c.eat();
        d.bark();
    }
}
