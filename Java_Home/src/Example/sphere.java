package Example;
import java.util.Scanner;


public class sphere {
    public static void main (String[]args){
        double radius,area;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = S.nextDouble();

        area = 4 * Math.PI*radius*radius;

        System.out.println(area);



    }
}
