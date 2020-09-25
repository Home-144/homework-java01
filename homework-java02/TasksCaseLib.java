package ua.univer.base.homework;

import java.util.Scanner;

public class TasksCaseLib {
    public static int Task04DayInMonth(int month) {
      //   int month;
         int day=0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4, 6, 9, 11:
                day = 30;
                break;
        }
        return day;
    }
    public static void Task09NextDay(int day1, int month) {

        month=month;
        day1=day1;
        int maxd;
        switch (month) {
            case 1, 3, 5, 7, 8, 10:
                maxd = 31;
                if (day1 < maxd) day1++;
                if (day1 == maxd) month++;
                if (day1 == maxd) day1 = 1;
                break;
            case 2:
                maxd = 28;
                if (day1 < maxd) day1++;

                if (day1 == maxd) month++;
                if (day1 == maxd) day1 = 1;
                break;
            case 4, 6, 9, 11:
                maxd = 30;
                if (day1 < maxd) day1++;
                if (day1 == maxd) month++;
                if (day1 == maxd) day1 = 1;

                break;
            case 12:
                maxd = 31;
                if (day1 < maxd) day1++;
                if (day1 == maxd) day1 = 1;
                month = 1;
                break;
            default:
        }
        System.out.println("Следующий день "+day1 + "/" + month);
    }
    public static void Task18DescriptionString() {

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите число от 100 до 999");
            int num = sc1.nextInt();
            //       int num = 999;
            //     int num1 = num;
            String number = new String();
            String number1 = new String();
            String number3 = new String();

            switch (num / 100) {
                case 1:
                    number = "Сто ";
                    break;
                case 2:
                    number = "Двести ";
                    break;
                case 3:
                    number = "Триста ";
                    break;
                case 4:
                    number = "Четыреста ";
                    break;
                case 5:
                    number = "Пятьсот ";
                    break;
                case 6:
                    number = "Шестьсот ";
                    break;
                case 7:
                    number = "Семьсот ";
                    break;
                case 8:
                    number = "Восемьсот ";
                    break;
                case 9:
                    number = "Девятьсот ";
                    break;
            }

            switch (num % 100) {
                case 10:
                    number1 = "десять";
                    break;
                case 11:
                    number1 = "одиннадцать";
                    break;
                case 12:
                    number1 = "двенадцать";
                    break;
                case 13:
                    number1 = "тринадцать";
                    break;
                case 14:
                    number1 = "четырнадцать";
                    break;
                case 15:
                    number1 = "пятнадцать";
                    break;
                case 16:
                    number1 = "шеснадцать";
                    break;
                case 17:
                    number1 = "семнадцать";
                    break;
                case 18:
                    number1 = "восемнадцать";
                    break;
                case 19:
                    number1 = "девятнадцать";
                    break;
            }

            switch (num % 100 / 10) {

                case 2:
                    number1 = "двадцать ";
                    break;
                case 3:
                    number1 = "тридцать ";
                    break;
                case 4:
                    number1 = "сорок ";
                    break;
                case 5:
                    number1 = "пятьдесят ";
                    break;
                case 6:
                    number1 = "шестьдесят ";
                    break;
                case 7:
                    number1 = "семьдесяь ";
                    break;
                case 8:
                    number1 = "восемьдесят ";
                    break;
                case 9:
                    number1 = "девяносто ";
                    break;
            }

            switch (num % 10) {
                case 1:
                    number3 = "один";
                    break;
                case 2:
                    number3 = "два";
                    break;
                case 3:
                    number3 = "три";
                    break;
                case 4:
                    number3 = "четыре";
                    break;
                case 5:
                    number3 = "пять";
                    break;
                case 6:
                    number3 = "шесть";
                    break;
                case 7:
                    number3 = "семь";
                    break;
                case 8:
                    number3 = "восемь";
                    break;
                case 9:
                    number3 = "девять";
                    break;
            }

            System.out.println( "Вы ввели число " + "(" + number + number1 + number3 + ")");
    }
    public static void Task19OrientalCalendar(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc1.nextInt();
        String color = new String();
        String animals = new String();
/*
        for (int i = year; i<2022 ; i++) {
            System.out.println(i + " " + i%5 +" " + i%10);
        }
*/
// определение цвета года берем остаток от деления года на 10 тк один цвет на 2 года
        switch (year % 10) {
            case 4 , 5:
                color = "зеленый";
                break;
            case 6 , 7:
                color = "красный";
                break;
            case 8, 9:
                color = "желтый";
                break;
            case 0, 1:
                color = "белый";
                break;
            case 2, 3:
                color = "черный";
                break;
        }
// определение животного года (остаток от деления года на 12)
        switch (year % 12) {
            case 4:
                animals = "крысы";
                break;
            case 5:
                animals = "коровы";
                break;
            case 6:
                animals = "тигра";
                break;
            case 7:
                animals = "зайца";
                break;
            case 8:
                animals = "дракона";
                break;
            case 9:
                animals = "змеи";
                break;
            case 10:
                animals = "лошади";
                break;
            case 11:
                animals = "овцы";
                break;
            case 0:
                animals = "обезьяны";
                break;
            case 1:
                animals = "курицы";
                break;
            case 2:
                animals = "собаки";
                break;
            case 3:
                animals = "свиньи";
                break;
        }
        System.out.println("Год " + color + " " + animals);

    }
    public static void Task20ZodiacSigns(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите месяц ");
        int month = sc2.nextInt();
        String zodiak = new String();
        int z=0;
        if (month == 1 && day >= 20 || month == 2 && day <= 18) z = 1;
        else if (month == 2 && day >= 19 || month == 3 && day <= 20) z = 2;
        else if (month == 3 && day >= 21 || month == 4 && day <= 19) z = 3;
        else if (month == 4 && day >= 20 || month == 5 && day <= 20) z = 4;
        else if (month == 5 && day >= 21 || month == 6 && day <= 21) z = 5;
        else if (month == 6 && day >= 22 || month == 7 && day <= 22) z = 6;
        else if (month == 7 && day >= 23 || month == 8 && day <= 22) z = 7;
        else if (month == 8 && day >= 23 || month == 9 && day <= 22) z = 8;
        else if (month == 9 && day >= 23 || month == 10 && day <= 22) z = 9;
        else if (month == 10 && day >= 23 || month == 11 && day <= 22) z = 10;
        else if (month == 11 && day >= 23 || month == 12 && day <= 21) z = 11;
        else if (month == 12 && day >= 22 || month == 1 && day <= 19) z = 12;

        switch (z) {
            case 1:
                zodiak = "Водолей";
                break;
            case 2:
                zodiak = "Рыбы";
                break;
            case 3:
                zodiak = "Овен";
                break;
            case 4:
                zodiak = "Телец";
                break;
            case 5:
                zodiak = "Близнецы";
                break;
            case 6:
                zodiak = "Рак";
                break;
            case 7:
                zodiak = "Лев";
                break;
            case 8:
                zodiak = "Дева";
                break;
            case 9:
                zodiak = "Весы";
                break;
            case 10:
                zodiak = "Скорпион";
                break;
            case 11:
                zodiak = "Стрелец";
                break;
            case 12:
                zodiak = "Козерог";
                break;
        }
        System.out.println(zodiak);
    }


        // return d,m;



}
