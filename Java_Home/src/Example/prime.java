package Example;

import java.util.Scanner;

public class prime {
    public static void main(String[]args){
        int i,n, count=0; // here count is used for no. of factors
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the number");
        n = p.nextInt();

        for (i = 1; i <= n; i++){
            if(n % i == 0){
                count++;

            }
        }
        if (count == 2){
            System.out.println(n+ " is a prime number");
        }
        else {
            System.out.println(n+" is not prime number");
        }

    }
}
