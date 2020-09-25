package ua.univer.base.homework;

import java.util.Scanner;

import static java.lang.System.out;


public class HomeWorkTasksIf {
    public static void main(String[] args) {
        System.out.println("Выберите № задачи ");
        System.out.println("1- Задача 1");
        System.out.println("2- Задача 2");
        System.out.println("3- Задача 3");
        System.out.println("4- Задача 4");
        System.out.println("5- Задача 5");
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Введите № задачи ");
        int qa = sc0.nextInt();
        switch (qa){
            case 1:
            System.out.println("Дано целое число. Если оно является положительным, то прибавить к нему 1; если \n " +
                    "отрицательным,то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.");
            Scanner sc1 = new Scanner(System.in);
            out.println("Введите число ");
            int a = sc1.nextInt();
            a = TasksIfLib.TaskIf03ChangeNumber(a);
            out.println("Число = " + a);
            break;

            case 2:
                out.println("Даны три числа. Найти среднее из них (то есть число, расположенное между наименьшим и наибольшим).");

                Scanner sc2 = new Scanner(System.in);
                out.println("Введите три числа ");
                int x = sc2.nextInt();
                int y = sc2.nextInt();
                int z = sc2.nextInt();
                int avg = x;
                avg = TasksIfLib.TaskIf13BetweenNumber(x, y, z, avg);
                out.println("Среднее число = " + avg);
                break;

            case 3:
                out.println("Даны три переменные вещественного типа: A, B, C. Если их значения упорядочены по возрастанию или убыванию,\n" +
                        "            то удвоить их; в противном случае заменить значение каждой переменной на противоположное. Вывести новые\n" +
                        "            значения переменных A, B, C.");

                 Scanner sc3 = new Scanner(System.in);
                out.println("Введите три числа ");
                int e = sc3.nextInt();
                int d = sc3.nextInt();
                int c = sc3.nextInt();
                boolean s;
                boolean p;
                p = TasksIfLib.TaskIf17Change3Number(e, d, c);
                break;

            case 4:
                out.println("Даны координаты точки, не лежащей на координатных осях OX и OY.\n" +
                        "       Определить номер координатной четверти, в которой находится данная точка.");
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Введите координату Х");
                System.out.println("Введите координату У");
                int t = sc4.nextInt(), g = sc4.nextInt();
                TasksIfLib.TaskIf22Coordinates(t, g);
                break;

            case 5:
                out.println("Дано целое число, лежащее в диапазоне 1–999. Вывести его строкуописание вида\n" +
                        "          «четное двузначное число», «нечетное трехзначное число» и т. д.");

                Scanner sc5 = new Scanner(System.in);
                System.out.println("Введите число от 1 до 999");
                int n = sc5.nextInt();
                TasksIfLib.TaskIf30TextNumber(n);
                break;}



    }

}
