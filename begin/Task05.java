package ua.univer.base.homework.begin;
/*
Найти корни квадратного уравнения A·x2 + B·x + C = 0, заданного
своими коэффициентами A, B, C (коэффициент A не равен 0), если известно, что дискриминант уравнения положителен.
Вывести вначале меньший, а затем больший из найденных корней.
Корни квадратного уравнения находятся по формуле x1,2 = ( )/ − ± B D (2·A), где D — дискриминант, равный B2 – 4·A·C.

 */
public class Task05 {
    public static void main(String[] args) {
        int a=2,b=3,c=1;
        double sqr=Math.sqrt((b*b)-4*a*c);
        double x1=(-b+sqr)/2*a;
        double x2=(-b-sqr)/2*a;
        if (x1<x2) System.out.println("Меньший корень = " +x1 +" " + "Больший корень = " + x2);
        if (x1>x2) System.out.println("Меньший корень = " +x2 +" " + "Больший корень = " + x1);

    }
}
