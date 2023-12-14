package org.example;

public class Main {
    public static void main(String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign()
    {
        int a = 5;
        int b = -5;

        String result = (a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }
    public static void printColor()
    {
        int value = 101;

        if(value <= 0){
            System.out.println("Красный");
        } else if(value <= 100){
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers()
    {
        int a = 5;
        int b = 6;

        String result = a >= b ? "a >= b" : "a < b";
        System.out.println(result);
    }
}