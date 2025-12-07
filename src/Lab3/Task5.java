package Lab3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        CalculatingAmount.ForAmount(number);
        CalculatingAmount.WhileAmount(number);
    }

    static class CalculatingAmount {
        static void ForAmount(int number) {
            long sum = 0;

            System.out.print("Суммируемые числа: ");
            for (int i = 1; i <= number; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.print(i + " ");
                    sum += i;
                }
            }
            System.out.println("\nСумма: " + sum);
        }

        static void WhileAmount(int number) {
            long sum = 0;
            int i = 1;

            System.out.print("Суммируемые числа: ");
            while (i <= number) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.print(i + " ");
                    sum += i;
                }
                i++;
            }
            System.out.println("\nСумма: " + sum);
        }
    }
}
