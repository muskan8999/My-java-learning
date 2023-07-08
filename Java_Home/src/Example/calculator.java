package Example;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = t.nextInt();

        System.out.println("Enter the value of b");
        int b = t.nextInt();

        System.out.println("select the operator +, -, *, /");
        Scanner c = new Scanner(System.in);
        char num = c.next().charAt(0);
        int cal;

        switch (num){
            case '+':
                 cal = a+b;
                System.out.println(cal);
                break;

            case '-':
                 cal = a-b;
                System.out.println(cal);
                break;

            case '*':
                 cal = a*b;
                System.out.println(cal);
                break;

            case '%':
                 cal = a/b;
                System.out.println(cal);
                break;
        }




    }
}
