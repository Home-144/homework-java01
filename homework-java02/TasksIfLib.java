package ua.univer.base.homework;

import java.util.Scanner;

public class TasksIfLib {
    public static int TaskIf03ChangeNumber(int a) {
        /*
        If3. Дано целое число. Если оно является положительным, то прибавить к нему 1; если отрицательным,
    то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
         */

        if(a>0) a++;
        if(a<0) a=a-2;
        if(a==0) a=10;
     //   System.out.println("a = "+a);
        return a;
    }
    public static int TaskIf13BetweenNumber(int x, int y, int z, int avg) {
        /*
          If13. Даны три числа. Найти среднее из них (то есть число, расположенное между наименьшим и наибольшим).
         */
        avg=x;
        if (x > y && x < z) avg = x;
        if (y > x && y < z) avg = y;
        if (z > x && z < y) avg = z;


        return avg;
    }
    public static boolean TaskIf17Change3Number(int a, int b, int c) {
        /*
        If17. Даны три переменные вещественного типа: A, B, C. Если их значения упорядочены по возрастанию или убыванию,
            то удвоить их; в противном случае заменить значение каждой переменной на противоположное. Вывести новые
            значения переменных A, B, C.
         */

        boolean p;
        if (p=(a<b && b<c || a>b && b>c))
           System.out.println("a= "+2*a +" " + "b= "+2*b +" "+ "c= "+2*c);
        else
           System.out.println("a= "+-a +" " + "b= "+-b +" "+ "c= "+-c);
        return p;
    }
    public static void TaskIf22Coordinates(int x, int y)    {
            if (x > 0 && y > 0)
                System.out.println("Точка с координатами (" + x+":" + y + ") находиться в первой четверти");
            if (x < 0 && y > 0)
                System.out.println("Точка с координатами (" + x+":" + y + ") находиться во второй четверти");
            if (x < 0 && y < 0)
                System.out.println("Точка с координатами (" + x+":" + y + ") находиться в третей четверти");
            if (x >0 && y < 0)
                System.out.println("Точка с координатами (" + x+":" + y + ") находиться в четвертой четверти");

    }
    public static void TaskIf30TextNumber(int a) {

        String str1;
        String str2;
        String str3;

// Определяем четность/нечетность
        {
            if (a % 2 == 0) str1 = new String("Четное ");
            else str1 = new String("Нечетное ");
        }

        {
            if(a>0) str3= new String("положительное ");
            else str3 =new String("отрицательное ");
        }

        //  определяем разрядность числа

        {
            if (Math.abs(a) >= 10 && a < 100) str2 = new String("двузначное ");
            else  if (Math.abs(a) < 999 && Math.abs(a) >= 100) str2 = new String("трехзначное ");
            else str2 = new String("однозначное ");
            if (Math.abs(a) > 999) System.out.println("Введите число от 1 до 999");
        }
        System.out.println(str1 + str3 + str2 +"число");
    }
}
