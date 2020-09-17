package ua.univer.base.homework.bool;
/*
Boolean17. Дано целое положительное число. Проверить истинность высказывания: «Данное число является нечетным трехзначным».
 */
public class Task04 {
    public static void main(String[] args) {
        int a=157;

        System.out.println("Число нечетное и трехзначное " +((a%2!=0) & (a/100!=0 &(a/100<=9))));

    }
}
