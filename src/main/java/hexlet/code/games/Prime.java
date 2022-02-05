package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        Engine.game("Answer 'yes' if given number is prime. Otherwise answer 'no'.", getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random = (int) (1 + Math.random() * Engine.MAX_VALUE);
            questionsAndAnswers[0][i] = String.valueOf(random);
            questionsAndAnswers[1][i] = isPrime(random) ? "yes" : "no";
        }
        return questionsAndAnswers;
    }

    public static boolean isPrime(int number) {
        for (int j = 2; j < number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
