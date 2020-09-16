package ua.univer.base.homework.begin;
/*

Begin22°. Поменять местами содержимое переменных A и B и вывести новые
значения A и B.

 */
public class Task01 {
    public static void main(String[] args) {


        int a = 5, b = 2, c = 8;
        int d = c; // присваиваем знначение переменной с перемнной d
        System.out.println("a(0)="+a +" "+ "b(0)="+b +" "+ "c(0)="+c); // Вывод первоначальных значений
        c = b;  // Замена переменных согласно заданию (присваиваем значение b переменной с)
        b = a;
        a = d;

        System.out.println("a = " +d+ " "+  "b = " + b +" "+  "c = " + c); // вывод значений после замены
    }

}


