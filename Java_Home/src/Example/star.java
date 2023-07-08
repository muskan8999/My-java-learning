package Example;

public class star {
    public static void main(String[] args) {
        int i, j, row = 4;
        //outer loop for rows
        for (i = 0; i < row; i++) {
//inner loop for columns
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}
