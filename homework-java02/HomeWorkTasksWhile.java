package ua.univer.base.homework;

import java.util.Scanner;

public class HomeWorkTasksWhile {
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
            System.out.println("Даны целые положительные числа N и K. Используя только операции сложения и вычитания,\n" +
                    "             найти частное от деления нацело N на K, а также остаток от этого деления.");
            TasksWhileLib.TaskWhile03AdditionSubtractionOperation();
            break;
            case 2:
                System.out.println("Дано целое число N (> 0). Найти наименьшее целое положительное число K, квадрат которого\n" +
                        "             превосходит N: K2 > N. Функцию извлечения квадратного корня не использовать.");
            TasksWhileLib.TaskWhile07SmallestPositiveInteger();
            break;
            case 3:
                System.out.println("Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления,\n" +
                        "    вывести все его цифры, начиная с самой правой (разряда единиц).");
            TasksWhileLib.TaskWhile17DivisionCompletelyTakingRemainder();
            break;
            case 4:
                System.out.println("Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом:\n" +
                        "             F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … .\n" +
                        "             Проверить, является ли число N числом Фибоначчи. Если является, то вывести True, если нет — вывести False.");
            TasksWhileLib.TaskWhile24FibonacciNumber();
            break;
            case 5:
                System.out.println("Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено максимально возможное\n" +
                        "     количество квадратов со стороной C (без наложений). Найти количество квадратов, размещенных на прямоугольнике.\n" +
                        "     Операции умножения и деления не использовать.");
            TasksWhileLib.TaskWhile30NumberOfSquares();
            break;

        }
    }}
