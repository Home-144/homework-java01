package ua.univer.base.homework;

import java.util.Scanner;

public class TasksForLib {

    public static void TaskFor03InAscendingOrder()  {

        System.out.print("Введите первое число ");
        Scanner sc1 = new Scanner(System.in);
        int a=sc1.nextInt();
        System.out.print("Введите второе число ");
        Scanner sc2 = new Scanner(System.in);
        int b=sc2.nextInt();
        int n=0;
        int i =0;
        System.out.println("числа в порядке возрастания");
        for(i=a; i<=b; i++) {
            n = n + 1;
            System.out.print(+i+ ", " );
        }
        System.out.println(" Кол-во чисел " + n);
    }
    public static void TaskFor08MultiplicationOfNumbers() {
        /*
    For8. Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
     */
        System.out.print("Введите первое число ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.print("Введите второе число ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int n = 1;
        int i = 0;
        for (i = a; i <= b; i++) {
            n = n * i;
        }
        System.out.println("произведение всех целых чисел от A до B = " + n);
    }
    public static void TaskFor13ExpressionValue(){
         /*
    For13°. Дано целое число N (> 0). Найти значение выражения   1.1 – 1.2 + 1.3 – …
     */
      Scanner sc=new Scanner(System.in);
        System.out.println("Введате целое число N (> 0) ");
            int n = sc.nextInt();
            int i=1;
         //   float q=1f;
            double sum=0;
            for(i=1; i<=n; i++) {

                sum += Math.pow(-1, i+1) * ( 1 + (float)i/10);

            }
            System.out.println(" sum = " + sum + " ");

    }
    public static void TaskFor20FindAmount() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число ");
        int  n = sc1.nextInt();
        double result = 1;
        double res = 0;

        for (int i = 1; i <= n; i++) {
            result = result * i; // вычисление факториала
            res += result;  // окончательный результат

        }
        System.out.println("N = " + n + " ; " + "Result = " + res + " ; " + " Factorial = " + result);
    }
    public static void TaskFor33SequenceOfFibonacciNumbers(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите кол-во чисел Фибоначи ");
        int n = sc1.nextInt();
        int f1=1;
        int f2=1;
        int f3;
        for(int i = 3; i <= n; i++){
            f3=f1+f2;
            System.out.print(f3+" , ");
            f1=f2;
            f2=f3;
        }
    }

}
