// // 1. С помощью рекурсии.
////Создаем 2 метода.
////1-ый метод принимает на вход 3 числа и вызывает 2-ой метод.
////2-ой метод принимает на вход 1 число и возвращает через рекурсию сумму чисел от 1 до числа.
////например число 3:
////1+2+3 = вернет 6.

public class Task2 {
    static void recursion(int counter) {
        counter--;

        System.out.println("Первая половина метода recursion: " + counter);

        if (counter != 0)
            method(counter);

        System.out.println("Вторая половина метода recursion: " + counter);
    }

    static void method(int counter) {
        System.out.println("Первая половина метода method: " + counter);

        recursion(counter);

        System.out.println("Вторая половина метода method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }
}
