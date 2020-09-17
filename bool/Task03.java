package ua.univer.base.homework.bool;
/*
Boolean8. Даны два целых числа: A, B. Проверить истинность высказывания:
«Каждое из чисел A и B нечетное».
 */
public class Task03 {
    public static void main(String[] args) {
        int a=8;
        int b=4;
        System.out.println("каждое число нечетное " + ((a%2!=0) & (b%2!=0)));
    }
}
