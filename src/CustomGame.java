import java.util.Random;
import java.util.Scanner;

class CustomGame {

    private static boolean notWin = false;
    private static int tries = 3;

    static void game() {
        System.out.println("Тебе надо ввести  диапазон , в котором будет генерироваться число! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите верхний предел загаданного числа");
        int maxNumber = scanner.nextInt();
        int generatedNumber = getGeneratedNumber(maxNumber);
        notWin = true;
        System.out.println("У тебя есть всего три попытки, чтобы угадать число!");
        while (notWin && tries > 0) {
            int userNumber = getNumberFromUser();
            analiseNumber(userNumber, generatedNumber);
        }

    }

    private static int getGeneratedNumber(int maxNumber) {
        System.out.println("Я сейчас придумаю число от 0 до " + maxNumber);
        Random random = new Random();
        int generatedNumber = random.nextInt(maxNumber);
        System.out.println("Я сгенерировал: " + generatedNumber);
        return generatedNumber;
    }

    private static int getNumberFromUser() {
        System.out.println("Введи число: ");
        tries--;
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    private static void analiseNumber(int userNumber, int generatedNumber) {
        if (userNumber < generatedNumber) {
            System.out.println("Загаданное число больше");
        } else if (userNumber > generatedNumber) {
            System.out.println("Загаданное число меньше");
        } else {
            System.out.println("Победа!!");
            notWin = false;
        }
    }


}
