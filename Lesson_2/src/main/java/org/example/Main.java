package org.example;
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(2, 3);
        printColor(100);
        compareNumbers(5, 2);
    }

    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int one, int two)
    {
            int a = one;
            int b = two;
            String result = (a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
            System.out.println(result);
    }

    public static void printColor(int num)
    {
        int value = num;

        if(value <= 0){
            System.out.println("Красный");
        } else if(value <= 100){
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(int one, int two)
    {
        int a = one;
        int b = two;
        String result = a >= b ? "a >= b" : "a < b";
        System.out.println(result);
    }
}