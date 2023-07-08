package asc;
import Example.Access_modifier3;
// outside the package by subclass access modifier

class using extends Access_modifier3{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
      //  System.out.println(z);
     //   System.out.println(a);
    }
}
public class Access4 {
    public static void main(String[] args) {
        using c = new using();
        c.meth2();


    }
}
