package Example;

import java.util.Scanner;

public class pattern_square {
    public static void main(String[] args){
        int i,j, side ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of square");
        side = s.nextInt();

        for (i = 1; i <= side; i++){

            for (j = 1; j <= side; j++){
                System.out.print("* ");
            }
            System.out.println("\n");

        }


    }
}
