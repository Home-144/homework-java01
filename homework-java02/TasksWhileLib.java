package ua.univer.base.homework;

import java.util.Scanner;

public class TasksWhileLib {
    public static void TaskWhile03AdditionSubtractionOperation() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите 1-е число ");
        int n = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите 2-е число ");
        int k = sc2.nextInt();
        int res1=0;
        int ost=0;

        while (k<=n) {
            ost=n-k;
            res1=res1+1;
            n=ost;
        }
        System.out.println("Часное = " + res1 + " ; " + "Остаток = " + ost);
    }
    public static void TaskWhile07SmallestPositiveInteger()    {
        System.out.println("Введите число ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int k=1;
        while (k*k <= n){
            k=k+1;

        }
        System.out.println("Наименьшее число = " + k);
    }
    public static void TaskWhile17DivisionCompletelyTakingRemainder() {
        /*
    While17. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления,
    вывести все его цифры, начиная с самой правой (разряда единиц).
     */

        System.out.print("Введите число ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        while (n>=1) {
            int a=n%10;
            n=n/10;
            System.out.println(a);
        }
    }
    public static void TaskWhile24FibonacciNumber(){
         /*
    While24. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом:
             F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … .
             Проверить, является ли число N числом Фибоначчи. Если является, то вывести True, если нет — вывести False.
     */

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Число Фибоначи введите число ");
            int f1 = 1;
            int f2 = 1;
            int f3 = 0;
            int x = sc1.nextInt();
            boolean y;

            while (x > f3) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            if( y=(x == f3))

                System.out.println("Число " + f3 + " " + y);
            else System.out.println("Число "+f3 + " " + y);

    }
    public static void TaskWhile30NumberOfSquares() {
        /*
    While30. Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено максимально возможное
     количество квадратов со стороной C (без наложений). Найти количество квадратов, размещенных на прямоугольнике.
     Операции умножения и деления не использовать.
     */
    Scanner sc1 =new Scanner(System.in);
        System.out.println("Введите сторону прямоугольника а ");
        int a = sc1.nextInt();
        System.out.println("Введите сторону прямоугольника b ");
        int b = sc1.nextInt();
        System.out.println("Введите сторону квадрата ");
        int c = sc1.nextInt();
        int res1 = 0;
        int x = 0;

        while (a - c >= 0) {
            a -= c;
            x = b;
            while (x - c >= 0) {
                x -= c;
                ++res1;
            }

        }
        System.out.println("В прмоугольнике можно разместить " +res1 + " квадрата(-ов)");


    }

}
