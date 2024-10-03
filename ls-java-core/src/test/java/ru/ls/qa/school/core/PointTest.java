package ru.ls.qa.school.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    @DisplayName("Тест правильности расчета расстояния между точками (целые числа)")
    void testInt(){
        Point p1 = new Point(2,4);
        Point p2 = new Point(5,2);
        Assertions.assertEquals(p1.distance(p2), 3.605551275463989);
    }

    @Test
    @DisplayName("Тест правильности расчета расстояния между точками (дробные числа)")
    void testDouble(){
        Point p1 = new Point(1.5,3.1);
        Point p2 = new Point(4.3,2.5);
        Assertions.assertEquals(p1.distance(p2), 2.8635642126552705);
    }

}
