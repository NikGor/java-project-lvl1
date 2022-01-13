package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void game() {
        Engine.game("Answer 'yes' if number even otherwise answer 'no'.", getQuestionsAndAnswers());
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.ITERATIONS_NUMBER];
        for (int i = 0; i < Engine.ITERATIONS_NUMBER; i++) {
            int random = (int) (Math.random() * Engine.MAX_VALUE);
            questionsAndAnswers[0][i] = String.valueOf(random);
            questionsAndAnswers[1][i] = random % 2 == 0 ? "yes" : "no";
        }
        return questionsAndAnswers;
    }
}
