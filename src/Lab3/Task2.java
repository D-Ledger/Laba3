package Lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String dayOfTheWeek = in.nextLine();

        WeekDay.IfMethod(dayOfTheWeek);
        WeekDay.SwitchMethod(dayOfTheWeek);
    }

    static class WeekDay {
        static void IfMethod(String d) {
            String dayOfTheWeek = d;
            System.out.println("Задание с условного оператора if");

            if (dayOfTheWeek.equals("Понедельник")) {
                System.out.println("1 день");
            } else if (dayOfTheWeek.equals("Вторник")) {
                System.out.println("2 день");
            } else if (dayOfTheWeek.equals("Среда")) {
                System.out.println("3 день");
            } else if (dayOfTheWeek.equals("Четверг")) {
                System.out.println("4 день");
            } else if (dayOfTheWeek.equals("Пятница")) {
                System.out.println("5 день");
            } else if (dayOfTheWeek.equals("Суббота")) {
                System.out.println("6 день");
            } else if (dayOfTheWeek.equals("Воскресенье")) {
                System.out.println("7 день");
            } else {
                System.out.println("Такого дня нет!");
            }
        }

        static void SwitchMethod(String d) {
            System.out.println("Задание с оператором switch");
            String dayOfTheWeek = d;

            switch (dayOfTheWeek) {
                case "Понедельник":
                    System.out.println("1 день");
                    break;
                case "Вторник":
                    System.out.println("2 день");
                    break;
                case "Среда":
                    System.out.println("3 день");
                    break;
                case "Четверг":
                    System.out.println("4 день");
                    break;
                case "Пятница":
                    System.out.println("5 день");
                    break;
                case "Суббота":
                    System.out.println("6 день");
                    break;
                case "Воскресенье":
                    System.out.println("7 день");
                    break;
                default:
                    System.out.println("Такого дня нет!");
            }
        }
    }
}
