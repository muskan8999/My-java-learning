package Example;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int i;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the table no.");
        int num  = t.nextInt();
         for (i = 0; i <= 10; i++){
             System.out.println(num +"*" +i+ "=" +num*i );
         }
    }
}
