package ua.univer.base.homework.begin;

import java.sql.SQLOutput;

/*
Begin7°. Найти длину окружности L и площадь круга S заданного радиуса R:
L = 2·π·R, S = π·R2
В качестве значения π использовать 3.14.
 */
public class Task02 {
    public static void main(String[] args) {
        double R = 5; // радиус круга
        double Pi = 3.14;  // Число ПИ
        double L = 2*Pi*R; // Вычисление длины окружности
        double S = Pi*R*R; // Вычисление площади круга
        System.out.println("Длина окружности L="+L);
        System.out.println("Площадь круга S=" +S);
    }
}
