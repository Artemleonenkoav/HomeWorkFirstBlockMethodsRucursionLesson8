// Вы работаете в банке, и клиент хочет взять у вас кредит. Вы самостоятельно не считаете в уме сколько он может получит, а даете завести числа клиента в вашу программу.
//Программе, для расчета - может ли клиент оплатить кредит, нужны такие данные:
//а) Сколько клиент получает
//б) сколько у него есть денег на конец месяца
//с) на какой срок он хочет его взять
//д) сумма
//(порядок ввода можно изменять).
//Мы говорим о том, что все данные всегда корректны (не может клиент запросить -100) и мы их не проверяем на логику.
//
//Если клиенту кредит с ЕГО условиями доступен - выводим:
//"Поздравляем, вам может быть выдан кредит с сроком и суммой."
//Если клиенту с ЕГО условиями кредит НЕ доступен, указываем 2 текста друг за другом:
//"Вы можете взять кредит, но если увеличите кол-во месяцев (указать сколько месяцев доступно на его сумму)."
//
//"Или вы можете уменьшить сумму кредита на и за этот срок вы сможете его погасить"

import java.util.Scanner;

public class Task2Bank {
    public static void main(String[] args) {

        int value = 5;
        int secondValue;
        int thirdValue;
        int fourValue;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ЗП клиента  ");
        value = scanner.nextInt();
        if (value >= 100) {
            System.out.println("Вам одобрено ,вводите следующее значение ");
        } else {
            System.out.println("Пусть идёт работает больше ");
            return;
        }

        System.out.println("Сколько у клиента есть денег на конец месяца ");
        secondValue = scanner.nextInt();
        if (secondValue >= 100) {
            System.out.println("Вам одобрено ,вводите следующее значение ");
        } else {
            System.out.println("Пусть идёт работает больше ");
            return;
        }

        System.out.println("На какой срок он хочет его взять кредит ");
        thirdValue = scanner.nextInt();
        if (thirdValue >= 100) {
            System.out.println("Вам одобрено ,вводите следующее значение ");
        } else {
            System.out.println("Пусть идёт работает больше ");
            return;
        }

        System.out.println("Какую сумму хочет взять  ");
        fourValue = scanner.nextInt();
        if (fourValue >= 300) {
        } else {
            System.out.println("Пусть идёт работает больше ");
            return;
        }
        if (value + secondValue + fourValue >= 1000) {
            System.out.println("Клиенту кредит с ЕГО условиями доступен  ");
            System.out.println("Поздравляем, вам может быть выдан кредит с сроком на 4 года  и суммой в 5 000$ .");
        } else if (value + secondValue + fourValue >500 ) {
            System.out.println("\"Вы можете взять кредит, но если увеличите кол-во месяцев на 2 \"" + " или вы можете уменьшить сумму кредита на и за этот срок вы сможете его погасить");
        } else {
            System.out.println("Кредит НЕ одобрен , Пусть идёт работает больше ");
            return;
        }
    }
}





















