package ua.univer.base.homework.bool;
/*
Boolean9. Даны два целых числа: A, B. Проверить истинность высказывания:
«Хотя бы одно из чисел A и B нечетное».
 */
public class Task02 {
    public static void main(String[] args) {
        int a=7;
        int b=9;
        System.out.println("Нечетное число " + ((a%2!=0) | (b%2!=0)));
    }
}
