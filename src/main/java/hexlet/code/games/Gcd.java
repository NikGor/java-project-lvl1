package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void game() {
        Engine.game("Find the greatest common divisor of given numbers.", getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random1 = 1 + (int) (Math.random() * Engine.MAX_VALUE);
            int random2 = 1 + (int) (Math.random() * Engine.MAX_VALUE);
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
