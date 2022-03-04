package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void game() {
        Engine.game(RULES, getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random = getRandom(MAX_VALUE);
            questionsAndAnswers[0][i] = String.valueOf(random);
            questionsAndAnswers[1][i] = isEven(random) ? "yes" : "no";
        }
        return questionsAndAnswers;
    }

    public static boolean isEven(int numbers) {
        return numbers % 2 == 0;
    }
}
