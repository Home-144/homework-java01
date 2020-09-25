package ua.univer.base.homework;

import java.util.Scanner;

public class HomeWorkTasksFor {

    public static void main(String[] args) {
        System.out.println("Выберите № задачи ");
        System.out.println("1- Задача 1");
        System.out.println("2- Задача 2");
        System.out.println("3- Задача 3");
        System.out.println("4- Задача 4");
        System.out.println("5- Задача 5");
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Введите № задачи ");
        int n = sc0.nextInt();
        switch (n) {
            case 1:
                System.out.println("Даны два целых числа A и B (A < B). Вывести в порядке возрастания все\n" +
                        "          целые числа, расположенные между A и B (включая сами числа A и B),\n" +
                        "          а также количество N этих чисел.");
            TasksForLib.TaskFor03InAscendingOrder();
            break;

            case 2:
                System.out.println("Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.");

        TasksForLib.TaskFor08MultiplicationOfNumbers();
        break;

            case 3:
                System.out.println("Дано целое число N (> 0). Найти значение выражения   1.1 – 1.2 + 1.3 – …");
        TasksForLib.TaskFor13ExpressionValue();
        break;
            case 4:
                System.out.println("Дано целое число N (> 0). Используя один цикл, найти сумму 1! + 2! + 3! + … + N!\n" +
                        "            (выражение N! — N–факториал — обозначает произведение всех целых чисел от 1 до N: N! = 1·2·…·N).\n" +
                        "            Чтобы избежать целочисленного переполнения, проводить вычисления с помощью вещественных переменных и\n" +
                        "            вывести результат как вещественное число.");
        TasksForLib.TaskFor20FindAmount();
        break;

            case 5:
                System.out.println("Дано целое число N (> 1). Последовательность чисел Фибоначчи FK\n" +
                        "            (целого типа) определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … .\n" +
                        "            Вывести элементы F1, F2, ..., FN.");
        TasksForLib.TaskFor33SequenceOfFibonacciNumbers();
        break;
        }

    }
}
