package Arrays;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalStudy(matrix));
    }

    public static int diagonalStudy(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int sum = 0;
        for (int rowNo = 0; rowNo < r; rowNo++) {
            int primaryDiagonl = matrix[rowNo][rowNo];
            int secondaryDiagonal = matrix[rowNo][c - 1 - rowNo];
            sum += primaryDiagonl;
            // some condition
            if (rowNo != (c - 1 - rowNo)) {
                sum += secondaryDiagonal;
            }
        }
        return sum;
    }
}
