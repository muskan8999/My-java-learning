package Example;

import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        int i, j, row = 4;
        for (i = 1; i <= row; i++){

            for (j = 4; j >= i; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
