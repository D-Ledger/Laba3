package Lab3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        char[] letters = new char[size];

        for (int i = 0; i < size; i++) {
            letters[i] = (char) ('a' + i * 2);
        }

        System.out.print("Прямой порядок: ");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Обратный порядок: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();
    }
}
