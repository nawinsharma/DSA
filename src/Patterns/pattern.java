package Patterns;

public class pattern {
    public static void main(String[] args) {
        pattern10(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // *
        // * *
        // * * *
        // * * * *
    }

    static void pattern2(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * *
        // * * * *
        // * * * *
        // * * * *
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * *
        // * * *
        // * *
        // *
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // *
    // **
    // ***
    // ****
    // ***
    // **
    // *

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    //      * 
    //     * * 
    //    * * * 
    //   * * * * 
    //  * * * * * 
    //   * * * * 
    //    * * * 
    //     * * 
    //      * 
    }
    static void pattern7(int n) {
        for (int row = 1; row <=  n; row++) {

            for (int s = 0; s < n-row; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for(int col = 2; col<=row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
//          1 
//         2 1 2 
//       3 2 1 2 3 
//     4 3 2 1 2 3 4 
//   5 4 3 2 1 2 3 4 5 
    }
    static void pattern9(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            int noOfSpaces = n - c;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for(int col = 2; col<=c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }}
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 
//   4 3 2 1 2 3 4 
//     3 2 1 2 3 
//       2 1 2 
//         1 
     

static void pattern10(int n) {
    int originalN = n;
    n = 2*n;
    for(int row = 0; row<= n; row++){
        for(int col = 0; col <= n; col++){
            int atEveryIndex = originalN - Math.min(Math.min(row, col),Math.min(n-row, n-col));
            System.out.print(atEveryIndex);
        }
        System.out.println();
    }
    // 55555555555
    // 54444444445
    // 54333333345
    // 54322222345
    // 54321112345
    // 54321012345
    // 54321112345
    // 54322222345
    // 54333333345
    // 54444444445
    // 55555555555



            
}
}
