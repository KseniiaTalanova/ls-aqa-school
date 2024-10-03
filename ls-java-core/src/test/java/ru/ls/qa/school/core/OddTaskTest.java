package ru.ls.qa.school.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ru.ls.qa.school.core.OddTask.isOdd;

public class OddTaskTest {
    @Test
    @DisplayName("Тест правильности определения четности числа (четное число)")
    void testEven(){
        Assertions.assertTrue(isOdd(8));
    }

    @Test
    @DisplayName("Тест правильности определения четности числа (нечетное число)")
    void testOdd(){
        Assertions.assertFalse(isOdd(5));
    }
}
