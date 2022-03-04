package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        Engine.game(RULES, getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random = 1 + getRandom();
            questionsAndAnswers[0][i] = String.valueOf(random);
            questionsAndAnswers[1][i] = isPrime(random) ? "yes" : "no";
        }
        return questionsAndAnswers;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
