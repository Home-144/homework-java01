package ua.univer.base.homework.integer;

/*

Integer11°. Дано трехзначное число. Найти сумму и произведение его цифр.

 */
public class Task04 {
    public static void main(String[] args) {
        int a=485;
        int b=a/100; // находим первое число
        int c=a/10%10; // исходное число делим на 10 и из это числа выделяем остаток при делении на 10
        int d=a%10; // берем остаток исходного числа при делении на 10
        int summa= b+c+d;
        int umnog= b*c*d;


        System.out.println("Сумма цифр = " +summa);
        System.out.println("Произведение цифр = " +umnog);
    }
}
