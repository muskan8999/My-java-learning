package Example;
import java.util.Scanner;

public class hemisphere {
    public static void main (String[]args){
        double radius,area;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = S.nextDouble();

        area = 2 * Math.PI*radius*radius;

        System.out.println(area);




    }
}
