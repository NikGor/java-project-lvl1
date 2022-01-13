package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        Engine.game("What is the result of the expression?", getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        final int operationsNumber = 2;
        final int maxValue = 10;
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random1 = (int) (Math.random() * maxValue);
            int random2 = (int) (Math.random() * maxValue);
            int operation = (int) (Math.random() * operationsNumber);
            switch (operation) {
                case (0):
                    questionsAndAnswers[0][i] = String.valueOf(random1 + random2);
                    questionsAndAnswers[1][i] = String.format("Question: %d + %d ", random1, random2);
                    break;
                case (1):
                    questionsAndAnswers[0][i] = String.format("Question: %d * %d ", random1, random2);
                    questionsAndAnswers[1][i] = String.valueOf(random1 * random2);
                    break;
                default:
                    break;
            }
        }
        return questionsAndAnswers;
    }
}
