package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(1, 2);

        System.out.println("point1 (" + point1.x + "," + point1.y + ")");
        System.out.println("point2 (" + point2.x + "," + point2.y + ")");
        System.out.println("distance = " + point1.distance(point2));

    }
}
