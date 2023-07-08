package Example;

public class unary {
    public static void main(String[] args) {
        int a = 100;
        int pre_increment = ++a;
        System.out.println("pre_increment= "+pre_increment);
        int post_increment = a++;
        System.out.println("post_increment= "+post_increment);
        int b=10;
        int pre_dec = --b;
        System.out.println("pre_dec= "+ pre_dec);
        int post_dec = b--;
        System.out.println("post_dec= "+ post_dec);




    }
}
