package ua.univer.base.homework.begin;
/*
Begin19. Даны координаты двух противоположных вершин прямоугольника:
(x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
Найти периметр и площадь данного прямоугольника.
 */
public class Task04 {
    public static void main(String[] args) {
        int X1 = 1, Y1 = 1; // координата первой вершины прямоугольника
        int X2 = 5, Y2 = 8; // координата противоположной вершины прямоукольника
        int P = 2*(X2-X1)+2*(Y2-Y1); // находим периметр
        int S = (X2-X1)*(Y2-Y1); //Вычисление площади прмоугольника
        System.out.println("Площадь прямоугольника S="+S);
        System.out.println("Периметр прямоугольника P="+P);
    }
}
