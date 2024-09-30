package ru.ls.qa.school.core;

public class OddTask {
    public static boolean isOdd (int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int odd = 3;
        int even = 8;
        boolean result_odd = isOdd(odd);
        boolean result_even = isOdd(even);
        System.out.println("Число " + odd + " Четное? Ответ: " + result_odd);
        System.out.println("Число " + even + " Четное? Ответ: " + result_even);
    }
}
