package Example;

 abstract class animal{
    public abstract void animalSound(); //abstract method
     public void sleep()
     {
         System.out.println("zzz");
     }
 }

 //subclass
class pig extends animal{
     @Override
     public void animalSound() {
         System.out.println("The pig says: wee wee");
     }
 }

public class abstraction {
    public static void main(String[] args) {
        pig obj = new pig();
        obj.animalSound();
        obj.sleep();
    }
}
