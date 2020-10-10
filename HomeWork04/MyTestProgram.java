package HomeWork04;

public class MyTestProgram {
    public static void main(String[] args) {
        int m = 1;
        int n = 3;
        int[][] matrix = new int[n][n];
        if (matrix.length % 2 != 0) {
            //  m= matrix.length* matrix.length;
            matrix[matrix.length / 2][matrix.length / 2] = matrix.length * matrix.length;
        }
        for (int  i= 0;  i < matrix.length; i++) {
            for (int j = 0; j< matrix.length; j++) {
                matrix[j][i]= m;
                m++;
             //   System.out.print(matrix[i][j] + "\t");
            }
            for (int j = 1; j < matrix.length ; j++) {
                matrix[1][2]=m;
                m++;
              //  System.out.print(matrix[1][2] + "\t");
            }
            System.out.print(matrix[1][2] + "\t");
            System.out.println();
            }

                //System.out.print(matrix[i][j] + "\t");
               // System.out.println(i + " " + j);
            }

            }

