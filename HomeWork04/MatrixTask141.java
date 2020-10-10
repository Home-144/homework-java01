package HomeWork04;

public class MatrixTask141 {
    public static void main(String[] args) {
        createMatrix10iTask1();
        createMatrix5JTask2();
        createMatrixRowM();
        createMatrixRowArithmetProgrTask5();
        outputElementOddRow();
        outputMatrixReversLineOdd();



            System.out.println("---------------------------------------------------");
            int n = 7, m = 1;
            int[][] matrix = new int[n][n];
            if (n % 2 != 0) {
                matrix[(n / 2)][(n / 2)] = (n * n); // если N - нечетное то находим центр матрицы и заполняем его числом N * N
            }
            for (int i = 0; i < (n / 2); i++) { // идем вправо
                for (int j = i; j < (n - i); j++) {   // (n - i) - чтоб с каждым разом сторона становилась меньше
                    matrix[i][j] = m;
                    m++;


                }
                for (int j = 1; j < (n - i - i); j++) {   // начинаем с первого эл. так-как нулевой уже записан
                    matrix[(j + i)][(n - i) - 1] = m;    // (n - i) - 1 - отнимаем 1 чтоб не выходило за рамки массива
                    m++;

                }
                for (int j = (n - 2) - i; j >= i; j--) {  // (n - 2) - i - отнимаем 1 чтоб не выходило за рамки массива и еще одну 1
                    matrix[(n - i) - 1][(j)] = m;            // потому-что предыдущий эл. уже заполнен.
                    m++;
                }
                for (int j = ((n - i) - 2); j > i; j--) {
                    matrix[j][i] = m;
                    m++;

                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println(matrix[i][n - 1]);
            }


     //   public static void outputMatrixReversLineOdd() {
    /*
    Matrix11. Дана матрица размера M × N. Вывести ее элементы в следующем порядке: первая строка слева направо,
    вторая строка справа налево, третья строка слева направо, четвертая строка справа налево и т. д.
     */
            System.out.println("----------- Task11 ----------------------");
            // int m=3;
            // int k=3;

            // int[] array = new int[] {1,2,3,4};
            int[][] matrix = new int[][]{
                    {0, 1, 2, 3},
                    {4, 5, 6, 7},
                    {8, 9, 10, 11}
            };

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    // k=matrix[i].length;
                    if (i % 2 == 0)
                        System.out.print(matrix[i][j] + "\t");
                    else
                        System.out.print(matrix[i][matrix[i].length - j - 1] + "\t");
                }
                System.out.println();
            }
        }

    private static void outputMatrixReversLineOdd() {
    }

    public static void outputElementOddRow() {
    /* Matrix9. Дана матрица размера M × N. Вывести ее элементы, расположенные в строках с
    четными номерами (2, 4, ...). Вывод элементов производить по строкам, условный оператор не использовать.);
    */
            System.out.println("----------- Task9 ----------------------");
            int m = 10;
            int n = 5;
            int odd = 0;
            //  int d=8;
            // int[] array = new int[] {1,2,3,4};
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i = i + 2) {
                for (int j = 0; j < matrix[i].length; j++) {

                    System.out.print(matrix[i][j] + "\t");

                }
                System.out.println();
            }
        }

        public static void createMatrixRowArithmetProgrTask5() {
    /*
    Matrix5. Даны целые положительные числа M, N, число D и набор из M чисел.
    Сформировать матрицу размера M × N, у которой первый столбец совпадает с исходным набором чисел, а элементы
    каждого следующего столбца равны сумме соответствующего элемента предыдущего столбца и числа D
    (в результате каждая строка матрицы будет содержать элементы арифметической прогрессии).
     */
            System.out.println("----------- Task5 ----------------------");
            int m = 4;
            int n = 5;
            int d = 8;
            int[] array = new int[]{1, 2, 3, 4};
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][0] = array[i];
                }

            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j == 0)
                        matrix[i][j] = matrix[i][j];
                    else
                        matrix[i][j] = matrix[i][j - 1] + d;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static void createMatrixRowM() {
    /*
    Matrix3. Даны целые положительные числа M, N и набор из M чисел. Сформировать матрицу размера M × N,
    у которой в каждом столбце содержатся все числа из исходного набора (в том же порядке).
     */
            System.out.println("----------- Task3 ----------------------");
            int m = 4;
            int n = 5;
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = i;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static void createMatrix5JTask2() {
    /*
    Matrix2. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N,
    у которой все элементы J-го столбца имеют значение 5·J (J = 1, ..., N).
     */
            System.out.println("----------- Task2 ----------------------");
            int m = 4;
            int n = 5;
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 5 * j;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static void createMatrix10iTask1() {

    /*
    Matrix1. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N,
    у которой все элементы I-й строки имеют значение 10·I (I = 1, ..., M).
     */
            System.out.println("----------- Task1  ----------------------");
            int m = 4;
            int n = 5;
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 10 * i;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

