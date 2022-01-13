package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        Engine.game("Answer 'yes' if given number is prime. Otherwise answer 'no'.", getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random = (int) (Math.random() * Engine.MAX_VALUE);
            questionsAndAnswers[0][i] = String.valueOf(random);
            for (int j = random - 1; j > 1; j--) {
                questionsAndAnswers[1][i] = (random % j == 0) ? "no" : "yes";
            }
        }
        return questionsAndAnswers;
    }
}
