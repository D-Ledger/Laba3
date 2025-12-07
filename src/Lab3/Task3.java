package Lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел фибоначчи:");
        int number = in.nextInt();

        Fibonacci.ForFib(number);
        Fibonacci.WhileFib(number);
    }

    static class Fibonacci {
        static void ForFib(int number) {
            System.out.println("Задание с условным оператором for");
            int a = 1;
            int b = 1;

            if (number <= 0) {
                System.out.println("Число должно быть положительным");
            }

            for (int i = 0; i < number; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }

        static void WhileFib(int number) {
            System.out.println("\nЗадание с условным оператором while");
            int count = 0;
            int a = 1;
            int b = 1;

            if (number <= 0) {
                System.out.println("Число должно быть положительным");
            }

            while (count < number) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
                count++;
            }
        }
    }
}
