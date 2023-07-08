package Example;
//within package
class c2 {
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

public class Access_modifier2 {
    public static void main(String[] args) {
        c2 c = new c2();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
      //  System.out.println(c.a);

    }
}


