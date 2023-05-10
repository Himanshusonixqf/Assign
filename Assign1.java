
import java.util.Scanner;

class Assign1 {
    public static void main(String[] args) {
        // declare instance of Scanner class
        Scanner sc = new Scanner(System.in);
        // declare variables
        int row,  num, i, j, k;

        // take input 
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
       

        // new line
        System.out.println("");

        // initilize
        num = 1;
        k = 1;

        // display the pattern
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                // display value
                System.out.print(num + "\t");
                // increment
                num = num + k;
            }
            // when the index of the 
            // next row is even 
            if (i % 2 == 1) {
                // calculate the value with 
                // which the next row starts
                num = num + i;
                // increment value
                k = -1;
            }
            // when the index of the 
            // next row is odd 
            else {
                // calculate the value with 
                // which the next row starts
                num = num + i + 1;
                // increment value
               k = +1;
            }
            // new line
            System.out.println("");
        }
    }
}

