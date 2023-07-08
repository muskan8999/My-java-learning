package Example;

public class left_triangle_star {
    public static void main(String[] args) {
        int i,j, k, row = 4;
        for (i = 1; i<=row; i++){

           // for (k = 3; k >= i; k--){ // for space
            //    System.out.print(" ");
           // }

            for (j = i; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
