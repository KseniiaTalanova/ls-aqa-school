package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.x = 3;
        point1.y = 5;
        Point point2 = new Point();
        point2.x = 1;
        point2.y = 2;

        System.out.println("distance = " + point1.distance(point2));

    }
}
