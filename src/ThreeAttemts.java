import java.util.Random;
import java.util.Scanner;

class ThreeAttemts {

    private static boolean notWin = false;
    private static int tries = 3;

    static void game() {

        int generatedNumber = getGeneratedNumber();
        notWin = true;
        System.out.println("У тебя есть всего три попытки , чтобы угадать число!");
        while (notWin && tries > 0) {
            //System.out.println(" прохожу цикл, тк переменная i == " + i);
            int userNumber = getNumberFromUser();
            analiseNumber(userNumber, generatedNumber);
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

