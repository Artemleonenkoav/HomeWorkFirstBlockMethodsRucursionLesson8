// Простая рекурсия

public class Task1 {
    static void recursion(int counter , int counter2 , int counter3) {
        counter--;
        counter2--;
        counter3--;

        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            recursion(counter, counter2, counter3);


        System.out.println("Вторая половина метода: " + counter);
    }

    public static void main(String[] args) {

        recursion(3 , 5, 4);
    }
}

