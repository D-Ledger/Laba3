package Lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        SortNumbers.ForSortNumbers(firstNumber, secondNumber);
        SortNumbers.WhileSortNumbers(firstNumber, secondNumber);
    }

    static class SortNumbers {
        static void ForSortNumbers(int firstNumber, int secondNumber) {
            System.out.println("Задание с условным оператором for");
            int least = Math.min(firstNumber, secondNumber);
            int largest = Math.max(firstNumber, secondNumber);

            for (int i = least; i <= largest; i++) {
                System.out.println(i);
            }
        }

        static void WhileSortNumbers(int firstNumber, int secondNumber){
            System.out.println("Задание с условным оператором while");
            int least = Math.min(firstNumber, secondNumber);
            int largest = Math.max(firstNumber, secondNumber);

            while (least <= largest) {
                System.out.println(least);
                least++;
            }
        }
    }
}


