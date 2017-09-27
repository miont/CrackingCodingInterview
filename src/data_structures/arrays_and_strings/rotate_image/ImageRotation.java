package data_structures.arrays_and_strings.rotate_image;

public class ImageRotation {

    public static int[][] rotateClockwise90Deg(int[][] mat) throws Exception {
        if (mat == null) return null;
        int n = mat.length;
        if(n == 0) return mat;
        if(mat[0].length != n) throw  new Exception("Matrix is not square.");

        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }
        return res;
    }

//    interface Transformation {
//        int getRow(int r, int c);
//        int getColumn(int r, int c);
//    }
//
//    class Clockwise90DegTransformation implements Transformation {
//
//        @Override
//        public int getRow(int r, int c) {
//            return c;
//        }
//
//        @Override
//        public int getColumn(int r, int c) {
//            return 0;
//        }
//    }


    public static void printMatrix(int[][] mat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                sb.append(mat[i][j] + " ");
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {

        try {
            int[][] mat1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
            System.out.println("Input:");
            printMatrix(mat1);
            System.out.println("Result:");
            printMatrix(rotateClockwise90Deg(mat1));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
