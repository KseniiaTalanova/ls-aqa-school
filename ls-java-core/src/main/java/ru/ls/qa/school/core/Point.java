package ru.ls.qa.school.core;

public class Point {
    double x, y;

    public double distance(Point point){
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }
}
