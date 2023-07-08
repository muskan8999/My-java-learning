package Example;
import java.util.Scanner;

public class cube {
    public static void main (String[]args){
        double area, a;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the side");
        a = c.nextDouble();

        area = 6*a*a;
        System.out.println(area);

    }
}
