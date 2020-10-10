package HomeWork04;

import java.util.Random;
import java.util.Scanner;

public class MatrixTask142 {
    public static void main(String[] args) {
        /*
        Matrix17. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Найти сумму и произведение элементов
         K-й строки данной матрицы.
         */
        Random rand1=new Random();
        int m;
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println(" Введите размер матрицы ");
        m= sc.nextInt();
        n= sc.nextInt();
        int f=4;
        int[][] matrix1 = new int[m][n];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j]=rand1.nextInt(20);
                System.out.print(matrix1[i][j] +"\t");
            }
            System.out.println();
        }

    //    printSumAndMultipLine(sc, matrix1);
    //    printSumAlwaysLine(matrix1);
//        printAverAndCountElement(m, n, matrix1);
//        countRowUnicElement(m, matrix1);

        /*
        Matrix45. Дана матрица размера M × N. Найти максимальный среди элементов тех столбцов,
        которые упорядочены либо по возрастанию, либо по убыванию. Если упорядоченные столбцы в матрице
        отсутствуют, то вывести 0.
        */
        int max=0;
        int comp=0;
        int count=0;
        int [] array= new int[matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length-1; j++) {

              array[j]=matrix1[j][i];
             comp=matrix1[j+1][i];
                if((array[j] > comp && comp>matrix1[j+2][i]))
                    max=array[j];

 //              if (a < comp) { ;
   //                count++;
   //            }
               else break;

            }

        }
        System.out.println(count +" "+ max);
    }

    public static void countRowUnicElement(int m, int[][] matrix1) {
    /*
    Matrix38. Дана целочисленная матрица размера M × N. Найти количество ее строк, все элементы которых различны.
     */
        int[] temp = new int[matrix1.length];
        int count=0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                temp[i] = matrix1[j][i];
            }
            if (compairValues(temp)) count++;
        }
        System.out.println("В матрице " + count + " строк с неповторяющимися элементами");
    }

    private static boolean compairValues(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }

    public static void printAverAndCountElement(int m, int n, int[][] matrix1) {
    /*
    Matrix30. Дана матрица размера M × N. В каждом ее столбце найти количество элементов,
    больших среднего арифметического всех элементов этого столбца.
     */
        System.out.println("---------------------------------------");
        double aver=0;
        int count=0;
        int sum=0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                sum=sum+ matrix1[i][j];
                aver=sum/(m * n);
                }
             }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (aver< matrix1[i][j])
                    count++;
            }

        }
        System.out.println("Среднее арифм = "+ aver +" " + "\t кол-во елем = " + count);
    }

    public static void printSumAlwaysLine(int[][] matrix1) {
          /*
        Matrix19. Дана матрица размера M × N. Для каждой строки матрицы найти
                   сумму ее элементов.
         */
        int sum=0;
        for (int i = 0; i < matrix1.length; i++) {
            sum=0;
            for (int j = 0; j < matrix1.length; j++) {
                sum=sum+ matrix1[i][j];
            }
            System.out.println("Строка [" +i+ "] : сумма строки = "+ sum);

        }
    }

    public static void printSumAndMultipLine(Scanner sc, int[][] matrix1) {
        int sum=0;
        double multp=1;
        System.out.println( "Введите строку ");
        int k= sc.nextInt();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (k==i) {
                    sum=sum+ matrix1[i][j] ;
                multp=multp* matrix1[i][j];

                }
            }

        }
        System.out.println(sum);
        System.out.println(multp);
    }
}
