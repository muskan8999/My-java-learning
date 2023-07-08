package Example;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int i, fact = 1;    
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num  = t.nextInt();
         for (i = 1; i <= num; i++){
             fact = fact*i;

         }
        System.out.println("factorial of " + num + " is " + fact );
    }
}
