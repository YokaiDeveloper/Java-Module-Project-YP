import java.util.Scanner;

public class Main {
    public static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 1) {
                    return number;
                } else {
                    System.out.println("Указано неверное значение");
                }
            } else {
                System.out.println("Указано неверное значение. Пожалуйста, введите целое " +
                        "число больше 1.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какое кол-во человек необходимо разделить счет? :)");

        int countHuman = getNumber(scanner);
        System.out.println("Количество людей: " + countHuman);
    }
}