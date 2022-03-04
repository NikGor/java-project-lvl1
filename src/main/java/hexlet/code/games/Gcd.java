package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    public static final String RULES = "What is the result of the expression?";

    public static void game() {
        Engine.game(RULES, getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random1 = 1 + getRandom(MAX_VALUE);
            int random2 = 1 + getRandom(MAX_VALUE);
            questionsAndAnswers[0][i] = String.format("%d %d", random1, random2);
            questionsAndAnswers[1][i] = String.valueOf(getGcd(random1, random2));
        }
        return questionsAndAnswers;
    }

    public static int getGcd(int number1, int number2) {
        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);
        int gcd = 1;
        if (max % min == 0) {
            gcd = min;
        } else {
            int cd = min;
            while (cd > 1) {
                if ((min % cd == 0) && (max % cd) == 0) {
                    gcd = cd;
                    break;
                }
                cd--;
            }
        }
        return gcd;
    }
}
