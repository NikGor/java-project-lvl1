package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utilities;

public class Even {
    public static void game() {
        String name = Engine.intro("Answer 'yes' if number even otherwise answer 'no'.");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (Engine.checkAnswer(createQuestion(), name)) {
                counter++;
            } else break;
        }
        Engine.outro(counter, name);
    }

    public static String createQuestion() {
        int random = (int) (Math.random() * 100);
        System.out.println(String.format("Question: %d", random));
        return random % 2 == 0 ? "yes" : "no";
    }
}