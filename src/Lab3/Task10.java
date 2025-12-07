package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int size = 0;

        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                size = Integer.parseInt(in.nextLine());
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным числом");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено не целое число");
            }
        }

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Массив после сортировки по убыванию:");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}