package Example;
import java.util.Scanner;

public class rectangle {
    public static void main (String[]args){
        double a,b, area;
        Scanner r = new Scanner(System.in);
        System.out.println("enter the length");
        a= r.nextDouble();

        System.out.println("enter the breadth");
        b= r.nextDouble();

        area= a*b;

        System.out.println(area);



    }
}
