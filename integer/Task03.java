package ua.univer.base.homework.integer;
/*
Integer8°. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
 */
public class Task03 {
    public static void main(String[] args) {
        int a= 29; // заданное двузначное число
        int b= a%10*10+a/10; // берем остаток от деления на 10 умножаем на 10 и прибавляем целую часть отделения на 10
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
