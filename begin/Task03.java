package ua.univer.base.homework.begin;
/*
        Begin13. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). Найти
        площади этих кругов S1 и S2, а также площадь S3 кольца, внешний радиус
        которого равен R1, а внутренний радиус равен R2
        S1 = π·(R1)2,
        S2 = π·(R2)2,
        S3 = S1 – S2.
*/

public class Task03 {
    public static void main(String[] args) {
    double Pi=3.14; // Число пи
    int R1=8, R2=3; // Радиусы кругов (пусть будут целыми числами)
    double S1 = Pi*R1*R1; // Вычисление площади 1-го круга
    double S2 = Pi*R2*R2; // Вычисление площади 2-го круга
    double S3 = S1-S2; // Вычисление площади кольца
        System.out.println("Площадь большого круга S1= "+S1);
        System.out.println("Площадь малого круга S2= "+S2);
        System.out.println("Площадь кольца S3= "+S3);

    }
}