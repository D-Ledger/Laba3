package Lab3;

public class Task8 {
    public static void main(String[] args) {
        char[] consonantLetters = new char[10];
        int index = 0;
        char letter = 'A';

        while (index < 10 && letter <= 'Z') {
            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U') {
                consonantLetters[index] = letter;
                index++;
            }
            letter++;
        }

        System.out.print("Массив согласных: ");
        for (int i = 0; i < index; i++) {
            System.out.print(consonantLetters[i] + " ");
        }
        System.out.println();
    }
}
