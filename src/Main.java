import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static boolean gameProcess = true;

    public static void main(String[] args) {
        System.out.println("приветик!");
        do {
            beginning();

        } while (gameProcess);
    }

    private static void beginning() {
        System.out.println("в какую игру хочешь поиграть?");
        System.out.println("1.классическая угадайка с 3 попытками \n2.угадайка с безлимитным количеством попыток \n3.кастомная игра \n решай сам!");
        getUserChoice();
    }

    private static void getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                ThreeAttemts.game();
                break;
            case 2:
                NonLimitattempts.game();
                break;
            case 3:
                CustomGame.game();
                break;
            case 4:
                break;
            default:
                getUserChoice();
        }
        System.out.println("Пока!Удачи!");
        gameProcess = false;
    }

    private static void playAgain() {
        System.out.println("Хотите сыграть еще? Напишите пожалуйста да или нет!");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next().toLowerCase();
        if (userAnswer.equals("да")) {
            System.out.println("Отлично!Начинаем!!");
        } else if (userAnswer.equals("нет")) {
            System.out.println("Хорошо!До встречи!");
            gameProcess = false;
        } else {
            playAgain();
        }
    }

}
