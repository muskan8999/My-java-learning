package Example;
import java.util.*;

public class area {
    public static void main(String[] args) {
        double radius,area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = in.nextDouble();

        area = Math.PI* radius * radius;
        System.out.println("area of circle = "+ area );

    }
}


