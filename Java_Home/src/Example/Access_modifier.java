package Example;

// within class

class c1 {
    public int x = 5;
    protected int y = 3;
     int z = 2;

     private  int a = 10;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}

public class Access_modifier {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();

    }
}
