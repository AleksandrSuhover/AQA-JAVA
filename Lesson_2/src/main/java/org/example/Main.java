package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println(checkNumbersForRange(4, 17));
        checkNumberForPositivity(-5);
        System.out.println(checkNumberForNegativity(0));
        printTextInConsole("Hello world!", 2);
        checkLeapYear(8);
    }

    public static Boolean checkNumbersForRange(int firstNum, int secondNum){
        int sumNumbers = firstNum + secondNum;
        return sumNumbers >= 10 && sumNumbers <= 20 ? true : false;
    }

    public static void checkNumberForPositivity(int number){
        System.out.println(number >= 0 ? "Переданное число положительное."
                : "Переданное число отрицательное.");
    }

    public static Boolean checkNumberForNegativity(int number){
        return number < 0 ? true : false;
    }

    public static void printTextInConsole(String textToPrint, int quantity){
        while (quantity > 0){
            System.out.println(textToPrint);
            --quantity;
        }
    }

    public static void checkLeapYear(int year){
        System.out.println(year % 4);
    }
}