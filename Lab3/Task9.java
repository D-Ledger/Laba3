package Lab3;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Сгенерированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int minValue = array[0];
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }

        List<Integer> minIndices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                minIndices.add(i);
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы минимального значения: ");
        for (int index : minIndices) {
            System.out.print(index + " ");
        }
    }
}
