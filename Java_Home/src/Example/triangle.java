package Example;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        double s1, s2, s3, area, S;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle");
        s1 = t.nextDouble();
        s2 = t.nextDouble();
        s3 = t.nextDouble();
        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
        System.out.println(area);
    }
}
