package ua.univer.base.homework.integer;
/*
Integer3°. Дан размер файла в байтах. Используя операцию деления нацело,
найти количество полных килобайтов, которые занимает данный файл
(1 килобайт = 1024 байта).
 */
public class Task01 {
    public static void main(String[] args) {
        int Bite= 234544;
        int Kbite= Bite/1024;
        System.out.println("Размер в килобайтах = "+ Kbite);


    }
}
