//Данная версия ДЗ написана в стиле минимализма. В предыдущем коммите есть более читабельная версия)
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = 5, b = -5;
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 100;
        System.out.println(value <= 0 ? "Красный" : value <= 100 ? "Жёлтый" : "Зелёный");
    }

    public static void compareNumbers() {
        int a = 5, b = 5;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}