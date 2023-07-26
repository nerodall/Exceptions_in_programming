import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int input = 1;
        Scanner scan = new Scanner(System.in);
        while (input != 3) {
            System.out.println("Задание 1-1\nЗадание 2-2 \nВыход-3\n");

            input = Integer.parseInt(scan.nextLine());

            switch (input) {
                case 1:
                    task1();

                case 2:
                    task2();

                default:
                    break;
            }
        }
    }

    private static void task1() {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        if (input <= 0) {
            throw new InvalidNumberException("Число меньше нуля");
        } else {
            System.out.println("Число корректно!");
        }
    }

    private static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(scan.nextLine());

        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Результат деления = " + num1 / num2);
    }
}
