import java.util.Random;
import java.util.Scanner;

class NonLimitattempts {
        private static boolean notWin;

        static void game() {
            System.out.println("Привет!)");
            System.out.println("Тебе надо угадать число!");
            int tries = 0;
            int generatedNumber = getGeneratedNumber();
            notWin = true;
            while (notWin) {
                int userNumber = getNumberFromUser();
                tries++;
                analiseNumbers(generatedNumber, userNumber);
            }
            System.out.println("Количество использованных попыток: " + tries);
        }

        private static void analiseNumbers(int generatedNumber, int userNumber) {
            if (userNumber == generatedNumber) {
                System.out.println("Победа!!");
                notWin = false;
            } else if (userNumber < generatedNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }

        private static int getGeneratedNumber() {
            System.out.println("Я сейчас придумаю число от 1 до 10");
            Random random = new Random();
            int generatedNumber = random.nextInt(10);
            System.out.println("Я сгенерировал: " + generatedNumber);
            return generatedNumber;
        }

        private static int getNumberFromUser() {
            System.out.println("Введи число: ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            return userNumber;
        }


    }


